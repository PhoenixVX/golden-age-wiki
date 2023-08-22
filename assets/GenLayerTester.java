package net.minecraft.src;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.font.GlyphVector;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;

public class GenLayerTester {
	// Format options:
	// - MARKDOWN: Markdown table in text
	// - WIKI: Markdown table with images from golden-age-wiki
	// - ARRAY: Java array
	// - HEATMAP: Image for values between 0 and 65536 (copied to clipboard)
	private static final PrintMode format = PrintMode.MARKDOWN;
	private static final float[] heatmapColor = { 0.0F, 1.0F, 0.0F };

	// GenLayer input (not very reliable but it's good for quick and dirty stuff)
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

	public static void main(String[] args) {
		final int x = 4;
		final int y = 2;
		final int width = 8;
		final int height = 8;
		final int biomeScale = 4;
		final long seed = "Glacier".hashCode();
		GenLayer genLayer = new GenLayerIsland(1L);
		genLayer = new GenLayerFuzzyZoom(2000L, genLayer);
		genLayer = new GenLayerAddIsland(1L, genLayer);
		genLayer = new GenLayerZoom(2001L, genLayer);
		genLayer = new GenLayerAddIsland(2L, genLayer);
		genLayer = new GenLayerZoom(2002L, genLayer);
		genLayer = new GenLayerAddIsland(3L, genLayer);
		genLayer = new GenLayerZoom(2003L, genLayer);
		genLayer = new GenLayerAddIsland(4L, genLayer);
		genLayer = new GenLayerBiome(200L, genLayer, WorldType.DEFAULT_1_1);

		genLayer.initWorldGenSeed(seed);
		int[] array = genLayer.getInts(x, y, width, height);
		switch (format) {
			case MARKDOWN: printMarkdown(array, width, height); break;
			case WIKI: printWiki(array, width, height); break;
			case ARRAY: printArray(array, width, height); break;
			case HEATMAP: printHeatmap(array, width, height); break;
		}
	}

	// Nothing to see down here move along now

	public static void printMarkdown(int[] array, int width, int height) {
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
				int i = array[x + z * height];
				System.out.printf("|%-2d", i);
			}
			System.out.println("|");
		}
	}

	public static void printWiki(int[] array, int width, int height) {
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
				int i = array[x + z * height];
				System.out.print("|![" + i + "](/assets/biome/" + i + ".png)");
			}
			System.out.println("|");
		}
	}

	public static void printArray(int[] array, int width, int height) {
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

	public static void printHeatmap(int[] array, int width, int height) {
		final int scale = 48;
		BufferedImage img = new BufferedImage(width * scale, height * scale, BufferedImage.TYPE_INT_RGB);
		Graphics2D gfx = img.createGraphics();

		gfx.setStroke(new BasicStroke(2.0F));
		gfx.setFont(new Font("Minecraft", Font.PLAIN, 10));

		float[] color = new float[3];
		for (int x = 0; x < width; x++) {
			for (int z = 0; z < height; z++) {
				for (int i = 0; i < color.length; i++) {
					color[i] = lerp(1.0F, heatmapColor[i], Math.min(Math.max(array[x + z * height] / 65536.0F, 0.0F), 1.0F));
				}

				gfx.setColor(new Color(color[0], color[1], color[2]));
				gfx.fillRect(x * scale, z * scale, scale, scale);

				String text = String.valueOf(array[x + z * height]);
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

	private static float lerp(float a, float b, float t) {
		return a + (b - a) * t;
	}

	private enum PrintMode {
		MARKDOWN,
		WIKI,
		ARRAY,
		HEATMAP
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
