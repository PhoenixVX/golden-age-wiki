# McRegion Save Format
McRegion is a save format introduced in Beta 1.3 using code from Scaevolus' original [McRegion](https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods/mods-discussion/1346703-mod-mcregion-v5-optimized-saves-1-2_02) mod. This format was later succeeded by the [Anvil](anvil_save_format.md) save format in 1.2.1.

## File Structure
Region files are stored within the `region` folder of a world. A single region file is composed 1,024 chunks. An example of a region file name would be `r.8.20.mcr`, where `8` and `20` are the X and Z coordinates of the region respectively.

## File Header
TODO: Document location/timestamp tables as well as the chunk headers.

## Chunk Format
Each chunk has a 5 byte header, followed by a compressed compound tag.

**Header** (in order)
| Type | Size | Description |
| --- | --- | --- |
| Integer | 4 | The length of the compressed chunk data in bytes. |
| Byte | 1 | The compression type of the chunk. `1` for gzip and `2` for deflate. |

**Data**
| Name | Type | Description |
| --- | --- | --- |
| `xPos` | Integer | The X position of the chunk. |
| `zPos` | Integer | The Z position of the chunk. |
| `LastUpdate` | Long | The in-game time when the chunk was updated last. |
| `Blocks` | Byte Array | Stores a byte indicating the block ID. |
| `Data` | Nibble Array | Stores the metadata value of the block, sometimes used for direction/block variants. |
| `SkyLight` | Nibble Array | Stores the sun light propagation of each block. |
| `BlockLight` | Nibble Array | Stores the light value of each block. |
| `TerrainPopulated` | Byte | Whether any features have been generated yet. |
| `HeightMap`| Byte Array | Stores the top block height of each block. |
| `Entities` | List | A list containing compound tags of mobs/entities in the chunk. |
| `TileEntities` | List | Same as above but with [block entities](). |

## Relevant Classes
- `McRegionChunkLoader.java`
    - Responsible for loading chunks in the McRegion chunk format.
- `SaveConverterMcRegion.java`
    - Responsible for converting [Alpha](alpha_save_format.md) format to McRegion.
- `SaveOldDir.java`
    - Responsible for creating the McRegion ChunkLoader instance per-dimension. Also responsible for setting the save file format version (`19132`). On server-side, this class is also responsible for clearing the region cache.
- `RegionFile.java`
    - Responsible for returning chunk streams inside region files.
- `RegionFileCache.java`
    - Responsible for holding pending chunk region updates. Later synchronized to enable multi-threaded region/chunk loading and saving.
- `RegionFileChunkBuffer.java`
    - Responsible for holding a chunk position and the associated region file instance.
- `IThreadedFileIO.java`
- `ThreadedFileIOBase.java`
- `ThreadedChunkLoader.java`
    - Responsible for loading chunks in McRegion format off-thread, which improves performance when reading/writing regions.
- `ThreadedChunkLoaderPending.java`
    - Responsible for holding pending chunk region updates by holding the chunk position and the chunk NBT data.
    
## External Implementations
- As said above, Scaevolus' McRegion was the first implementation of the McRegion save format and is available at [MinecraftForum.net](https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods/mods-discussion/1346703-mod-mcregion-v5-optimized-saves-1-2_02) for Beta 1.2_02.
- [RegionTool](../assets/RegionTool_source.zip), also developed by Scaevolus, was a standalone implementation of the McRegion save format, which was able to convert worlds from the Alpha save format to the McRegion save format and back without a dependency on Minecraft code.