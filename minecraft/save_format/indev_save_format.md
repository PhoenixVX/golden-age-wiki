# Indev Save Format
The Indev save format was introduced in Indev 20100122 and was used until Infdev 20100325. It uses a single `.mclevel` NBT file to store data and was succeeded by the [Alpha Save Format](alpha_save_format.md).

## File Format
The `.mclevel` file consists of a compressed compound tag named `MinecraftLevel`, with the following data:

| Name | Type | Description |
| --- | --- | --- |
| About | Compound | Used to store level metadata. |
| Environment | Compound | Used to store level time and colors. |
| Map | Compound | Stores the actual level block array. |
| Entities | List | A list containing compound tags of mobs/entities in the chunk. |
| TileEntities | List | Same as above but with [block entities](). |

### About
| Name | Type | Description |
| --- | --- | --- |
| CreatedOn | Long | The Unix timestamp when the world was created. |
| Name | String | The name of the level. Always "A Nice World". |
| Author | String | The username of the player who created the world. |

### Environment
| Name | Type | Description |
| --- | --- | --- |
| TimeOfDay | Short | The number of ticks that have passed in the level, modulo 24,000. |
| SkyBrightness | Byte | The brightness of the sky from `0` to `16`. |
| SkyColor | Integer | The RGB color of the sky. |
| FogColor | Integer | The RGB color of the fog. |
| CloudColor | Integer | The RGB color of the clouds. |
| CloudHeight | Short | The Y coordinate of where the clouds start. |
| SurroundingGroundType | Byte | |
| SurroundingGroundHeight | Short | |
| SurroundingWaterType | Byte | |
| SurroundingWaterHeight | Short | |

### Map
| Name | Type | Description |
| --- | --- | --- |
| Width | Short | The width of the level. |
| Length | Short | The length of the level. |
| Height | Short | The depth of the level. |
| Spawn | List | A list of three short tags for the spawn coordinates. |
| Blocks | Byte Array | An array of block IDs at that position. |
| Data | Byte Array | An array of block metadata and block light. |

## Relevant Classes

## External Implementations
- Paul Spooner's [world generation scripts](https://www.peripheralarbor.com/minecraft/minecraftscripts.html) written in Python for Minecraft Indev.