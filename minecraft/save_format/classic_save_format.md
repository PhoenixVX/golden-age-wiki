The Classic save format is a simple save format designed by Notch, implemented in Classic c0.0.11a and replaced with Java serialization in Classic [PLACEHOLDER].

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
    } catch (final Exception ex) {
        ex.printStackTrace();
        return false;
    }
}

// Recompress the blocks array to GZip format
public void save() {
    try (DataOutputStream stream = new DataOutputStream(new GZIPOutputStream(new FileOutputStream(new File("level.dat"))))) {
        stream.write(this.blocks);
    } catch (final Exception ex) {
        ex.printStackTrace();
    }
}
```
Additionally, the level width and height were hard-coded to 256 up until Classic [PLACEHOLDER].