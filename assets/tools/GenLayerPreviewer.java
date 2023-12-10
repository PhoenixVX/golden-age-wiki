package net.minecraft.src;

import net.minecraft.client.Minecraft;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.font.GlyphVector;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class GenLayerPreviewer {
    // GenLayerPreviewer created by BlueStaggo 2023

	// Note: For GenLayerPreviewer to work properly, add "public final long seed"
	// to GenLayer's fields and "this.seed = var1" to GenLayer's constructor.

	// Format options:
	// - MARKDOWN: Markdown table in text
	// - WIKI: Markdown table with images from golden-age-wiki
	// - ARRAY: Java array
	// - HEATMAP: Image for values between 0 and 65536 (copied to clipboard)
	// - HEATMAP_ANNOTATED: Heatmap with numbers on the squares
	// - IMAGE: Image using biome colors (copied to clipboard)
	// - IMAGE_SEQUENCE: Sequence of images with information for each GenLayer
	//                   saved as a GIF if FFmpeg is installed (images saved to .minecraft/genlayertester)
    private static final Random random = new Random();
	private static final PrintMode format = PrintMode.IMAGE_SEQUENCE;
	private static final long seed = "Glacier".hashCode(); // Set seed here

	// To use a Minecraft font, drop the font file into %JAVA_HOME%/jre/lib/fonts.
	// Otherwise, system fonts can be used instead.
	private static final Font font = new Font("Minecraft", Font.PLAIN, 10);
	private static final Font bigFont = new Font("Minecraft", Font.PLAIN, 20);
	private static final Font titleFont = new Font("Minecraft", Font.PLAIN, 40);

	private static final float[] heatmapColor = { 0.0F, 1.0F, 0.0F };
	private static final File imageSequenceLocation = new File(Minecraft.getMinecraftDir(), "genlayertester");
	private static final String gifScript = "ffmpeg -framerate 0.5 -i \"genLayer%d.png\" -sws_dither none -vf tpad=start_mode=clone:start_duration=1:stop_mode=clone:stop_duration=3 genLayers.gif";

	// GenLayer input array
	private static final int[] input = {
		1,1,1,1,12,12,12,12,
		1,1,1,1,12,12,12,12,
		1,1,1,1,12,12,12,12,
		1,1,1,1,16,16,16,16,
		1,1,1,16,0,10,10,10,
		16,16,16,16,0,15,15,15,
		15,15,0,0,15,14,14,14,
		14,14,15,0,15,14,14,14,
	};
	private static final GenLayer inputGenLayer = new GenLayerArray(input);
	private static final List<GenLayer> genLayers = new ArrayList<>();
	private static final HashMap<Integer, Integer> randCol = new HashMap<>();

	public static void main(String[] args) {
		final int x = -432;
		final int y = -432;
		final int width = 864;
		final int height = 864;
		addGenLayers(GenLayer.func_48425_a(seed, WorldType.DEFAULT)[0]);

		initWorldGenSeed();
		if (format.isSequenced()) {
			format.sequencedPrint(genLayers, x, y, width, height);
		} else if (getLastGenLayer() != null) {
			int[] array = getLastGenLayer().getInts(x, y, width, height);
			format.print(array, width, height);
		}
	}

	// Nothing to see down here move along now

	private static GenLayer getLastGenLayer() {
		return genLayers.size() == 0 ? null : genLayers.get(genLayers.size() - 1);
	}

	private static GenLayer addGenLayer(Function<GenLayer, GenLayer> getGenLayer) {
		GenLayer genLayer = getGenLayer.apply(getLastGenLayer());
		genLayers.add(genLayer);
		return genLayer;
	}

	private static void addGenLayers(GenLayer genLayer) {
		while (genLayer != null) {
			genLayers.add(0, genLayer);
			genLayer = genLayer.parent;
		}
	}

	private static void initWorldGenSeed() {
		GenLayer genLayer = getLastGenLayer();
		if (genLayer != null) {
			genLayer.initWorldGenSeed(seed);
		}
	}

	private static int getBiomeColor(int i) {
		if (i >= 0 && i < 256 && BiomeGenBase.biomeList[i] != null) {
			BiomeGenBase biome = BiomeGenBase.biomeList[i];
			if (biome.color == 0) {
				biome.color = random.nextInt(0xFFFFFF);
			}

			return biome.color;
		}

		if (!randCol.containsKey(i)) {
			randCol.put(i, random.nextInt(0xFFFFFF));
		}

		return randCol.get(i);
	}

	private static void printMarkdown(int[] array, int width, int height) {
		for (int x = 0; x < width; x++) {
			System.out.print("|  ");
		}
		System.out.println("|");

		for (int x = 0; x < width; x++) {
			System.out.print("|--");
		}
		System.out.println("|");

		for (int z = 0; z < height; z++) {
			for (int x = 0; x < width; x++) {
				int i = array[x + z * width];
				System.out.printf("|%-2d", i);
			}
			System.out.println("|");
		}
	}

	private static void printWiki(int[] array, int width, int height) {
		for (int x = 0; x < width; x++) {
			System.out.print("|  ");
		}
		System.out.println("|");

		for (int x = 0; x < width; x++) {
			System.out.print("|--");
		}
		System.out.println("|");

		for (int z = 0; z < height; z++) {
			for (int x = 0; x < width; x++) {
				int i = array[x + z * width];
				System.out.print("|![" + i + "](/assets/biome/" + i + ".png)");
			}
			System.out.println("|");
		}
	}

	private static void printArray(int[] array, int width, int height) {
		System.out.println("{");
		int i = 0;
		for (int z = 0; z < height; z++) {
			System.out.print("\t");
			for (int x = 0; x < width; x++) {
				System.out.print(array[i++]);
				if (i < width * height) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
		System.out.println("}");
	}

	private static void printHeatmap(int[] array, int width, int height) {
		BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		int[] color = new int[3];
		for (int x = 0; x < width; x++) {
			for (int z = 0; z < height; z++) {
				for (int i = 0; i < color.length; i++) {
					color[i] = lerpi(255, (int)(heatmapColor[i] * 255.0F), Math.min(Math.max(array[x + z * height] / 65536.0F, 0.0F), 1.0F));
				}

				img.setRGB(x, z, color[0] << 16 | color[1] << 8 | color[2]);
			}
		}

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new ImageTransferable(img), null);
	}

	private static void printAnnotatedHeatmap(int[] array, int width, int height) {
		final int scale = 48;
		BufferedImage img = new BufferedImage(width * scale, height * scale, BufferedImage.TYPE_INT_RGB);
		Graphics2D gfx = img.createGraphics();

		gfx.setStroke(new BasicStroke(2.0F));
		gfx.setFont(font);

		float[] color = new float[3];
		for (int x = 0; x < width; x++) {
			for (int z = 0; z < height; z++) {
				for (int i = 0; i < color.length; i++) {
					color[i] = lerp(1.0F, heatmapColor[i], Math.min(Math.max(array[x + z * height] / 65536.0F, 0.0F), 1.0F));
				}

				gfx.setColor(new Color(color[0], color[1], color[2]));
				gfx.fillRect(x * scale, z * scale, scale, scale);

				String text = String.valueOf(array[x + z * width]);
				GlyphVector glyphVector = gfx.getFont().createGlyphVector(gfx.getFontRenderContext(), text);
				Shape textShape = glyphVector.getOutline();

				gfx.translate(x * scale + 2, z * scale + 9);
				gfx.setColor(Color.BLACK);
				gfx.draw(textShape);
				gfx.setColor(Color.WHITE);
				gfx.fill(textShape);
				gfx.translate(-(x * scale + 2), -(z * scale + 9));
			}
		}

		gfx.dispose();
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new ImageTransferable(img), null);
	}

	private static void printImage(int[] array, int width, int height) {
		BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		for (int x = 0; x < width; x++) {
			for (int z = 0; z < height; z++) {
				int i = array[x + z * width];
				int color = getBiomeColor(i);

				img.setRGB(x, z, color);
			}
		}

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new ImageTransferable(img), null);
	}

	private static void printImageSequence(List<GenLayer> genLayers, int x, int z, int width, int height) {
		imageSequenceLocation.mkdirs();

		for (File file : Objects.requireNonNull(imageSequenceLocation.listFiles())) {
			if (!file.isDirectory()) {
				file.delete();
			}
		}

		for (int n = 0; n < genLayers.size(); n++) {
			GenLayer genLayer = genLayers.get(n);
			String name = genLayer.getClass().getSimpleName();
			System.out.println((n + 1) + " / " + genLayers.size() + ": " + name);
			int[] array = genLayer.getInts(x, z, width, height);

			BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			Graphics2D gfx = img.createGraphics();

			for (int xx = 0; xx < width; xx++) {
				for (int zz = 0; zz < height; zz++) {
					int i = array[xx + zz * width];
					int color = getBiomeColor(i);

					img.setRGB(xx, zz, color);
				}
			}


			gfx.setStroke(new BasicStroke(2.0F));
			gfx.setFont(titleFont);
			gfx.translate(10, 40);

			GlyphVector glyphVector = gfx.getFont().createGlyphVector(gfx.getFontRenderContext(), name);
			Shape textShape = glyphVector.getOutline();

			gfx.setColor(Color.BLACK);
			gfx.draw(textShape);
			gfx.setColor(Color.WHITE);
			gfx.fill(textShape);

			gfx.setFont(bigFont);
			gfx.translate(0, 10);

			String[] lines = {
					"World Seed: " + seed,
					"Seed: " + genLayer.seed,
					"X: " + x,
					"Z: " + z
			};

			for (String line : lines) {
				gfx.translate(0, 20);
				glyphVector = gfx.getFont().createGlyphVector(gfx.getFontRenderContext(), line);
				textShape = glyphVector.getOutline();

				gfx.setColor(Color.BLACK);
				gfx.draw(textShape);
				gfx.setColor(new Color(0x55FFFF));
				gfx.fill(textShape);
			}

			gfx.dispose();

			try {
				File imgFile = new File(imageSequenceLocation, "genLayer" + n + ".png");
				imgFile.mkdirs();
				imgFile.delete();
				ImageIO.write(img, "png", imgFile);
			} catch (IOException e) {
				System.out.println("Failed to save image!");
				e.printStackTrace();
			}
		}

		boolean hasFFmpeg = Stream.of(System.getenv("PATH").split(Pattern.quote(File.pathSeparator)))
		        .map(Paths::get)
		        .anyMatch(path -> Files.exists(path.resolve("ffmpeg")) || Files.exists(path.resolve("ffmpeg.exe")));

		if (hasFFmpeg) {
			System.out.println("Creating GIF with FFmpeg...");
			System.out.println(gifScript);

			ProcessBuilder processBuilder = new ProcessBuilder();
			processBuilder.inheritIO();
			processBuilder.directory(imageSequenceLocation);
			processBuilder.command(gifScript.split(" "));

			try {
				Process process = processBuilder.start();
				process.waitFor();
			} catch (IOException | InterruptedException e) {
				System.out.println("Failed to create GIF!");
				e.printStackTrace();
			}
		} else {
			System.out.println("FFmpeg not found, GIF not created.");
		}

		try {
			Desktop.getDesktop().open(imageSequenceLocation);

			File gif = new File(imageSequenceLocation, "genLayers.gif");
			if (gif.exists()) {
				Desktop.getDesktop().open(gif);
			}
		} catch (IOException e) {
			System.out.println("Failed to open output directory.");
			e.printStackTrace();
		}
	}

	private static int lerpi(int a, int b, float t) {
		return (int)(a + (b - a) * t);
	}

	private static float lerp(float a, float b, float t) {
		return a + (b - a) * t;
	}

	private enum PrintMode {
		MARKDOWN,
		WIKI,
		ARRAY,
		HEATMAP,
		HEATMAP_ANNOTATED,
		IMAGE,
		IMAGE_SEQUENCE;

		static {
			MARKDOWN.setFunction(GenLayerPreviewer::printMarkdown);
			WIKI.setFunction(GenLayerPreviewer::printWiki);
			ARRAY.setFunction(GenLayerPreviewer::printArray);
			HEATMAP.setFunction(GenLayerPreviewer::printHeatmap);
			HEATMAP_ANNOTATED.setFunction(GenLayerPreviewer::printAnnotatedHeatmap);
			IMAGE.setFunction(GenLayerPreviewer::printImage);
			IMAGE_SEQUENCE.setSequencedFunction(GenLayerPreviewer::printImageSequence);
		}

		private GenLayerPrintFunction function;
		private GenLayerSequencePrintFunction sequencedFunction;
		private boolean sequenced;

		private void setFunction(GenLayerPrintFunction function) {
			this.function = function;
			sequencedFunction = (genLayers, x, z, width, height) -> function.print(genLayers.get(genLayers.size() - 1).getInts(x, z, width, height), width, height);
		}

		private void setSequencedFunction(GenLayerSequencePrintFunction function) {
			this.function = (array, width, height) -> function.print(Collections.singletonList(new GenLayerArray(array)), 0, 0, width, height);
			sequencedFunction = function;
			sequenced = true;
		}

		public void print(int[] array, int width, int height) {
			function.print(array, width, height);
		}

		public void sequencedPrint(List<GenLayer> genLayers, int x, int z, int width, int height) {
			sequencedFunction.print(genLayers, x, z, width, height);
		}

		public boolean isSequenced() {
			return sequenced;
		}
	}

	@FunctionalInterface
	private interface GenLayerPrintFunction {
		void print(int[] array, int width, int height);
	}

	@FunctionalInterface
	private interface GenLayerSequencePrintFunction {
		void print(List<GenLayer> genLayers, int x, int z, int width, int height);
	}

	private static class GenLayerArray extends GenLayer {
		private final int[] array;

		public GenLayerArray(int[] array) {
			super(0);
			this.array = array;
		}

		@Override
		public int[] getInts(int var1, int var2, int var3, int var4) {
			return array;
		}
	}

	private static class ImageTransferable implements Transferable {
	    private final BufferedImage image;

	    public ImageTransferable(BufferedImage image) {
	        this.image = image;
	    }

	    public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException {
	        if (flavor.equals(DataFlavor.imageFlavor)) {
		        return image;
	        }
            throw new UnsupportedFlavorException(flavor);
	    }

	    public DataFlavor[] getTransferDataFlavors() {
	        return new DataFlavor[]{DataFlavor.imageFlavor};
	    }

	    public boolean isDataFlavorSupported(DataFlavor flavor) {
	        return flavor.equals(DataFlavor.imageFlavor);
	    }
	}
}
