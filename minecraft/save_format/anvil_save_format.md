# Anvil Save Format
Anvil is a save format introduced in snapshot 12w07a for Release 1.2.1, and is based off the [McRegion](mcregion_save_format.md) save format. This format is still used today though there are numerous differences in the contents of the region files and chunk format.

## File Structure
Similar to the McRegion save format, Region files are stored within the `region` folder of the world. In the Anvil save format, each Region can hold up to 32x32 chunks, each indexed by their position inside the region.

## File Header

## Chunk Format

## Relevant Classes
- `AnvilChunkLoader.java`
    - Responsible for loading chunks in the Anvil format.
- `AnvilChunkLoaderPending.java`
    - Renamed from `ThreadedChunkLoaderPending.java` in the McRegion save format.
- `AnvilSaveFormat.java`
- `AnvilSaveHandler.java`
- `RegionFile.java`
- `RegionFileCache.java`
- `RegionFileChunkBuffer.java`

## External Implementations
- [AnvilConverter](../miscellaneous/AnvilConverter.zip) was a tool created to convert McRegion format worlds to the new Anvil format. Designed by Mojang, it contains original, deobfuscated code which shows how Anvil is implemented from a standalone point-of-view.