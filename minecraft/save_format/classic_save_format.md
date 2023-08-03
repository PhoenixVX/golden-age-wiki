# Classic Save Format

The Classic save format is a simple save format designed by Notch, implemented in Preclassic rd-132211 and replaced with Java serialization in Classic [PLACEHOLDER].

### General
Before Classic [PLACEHOLDER], the default level width, height, and depth were respectively 256, 256, 64, which would mean the maximum amount of blocks present in a level would be 4,194,304 blocks.

### Technical details
In early versions of Minecraft Classic, a save was simply the GZipped output of all block IDs contained within the level, similar to the following:
```java
// Contains the block IDs within the level.
private byte[] blocks;

// Decompress level.dat, recalculate lighting, and tick all blocks
public boolean load() {
    try (DataInputStream stream = new DataInputStream(new GZIPInputStream(new FileInputStream(new File("level.dat"))))) {
        stream.readFully(this.blocks);
        this.calcLightDepths(0, 0, this.width, this.height);
        for (LevelListener levelListener : this.levelListeners) {
            levelListener.allChanged();
        }
        return true;
    } catch (Exception ex) {
        ex.printStackTrace();
        return false;
    }
}

// Recompress the blocks array to GZip format
public void save() {
    try (DataOutputStream stream = new DataOutputStream(new GZIPOutputStream(new FileOutputStream(new File("level.dat"))))) {
        stream.write(this.blocks);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
```

## File Structure

## File Header

## Chunk Format