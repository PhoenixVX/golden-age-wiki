# Entity Metadata
Entity metadata is a format introduced in Beta 1.2 for sending entity state over the network. This page will document the possible metadata values of mobs and how metadata is encoded in Beta 1.7.3. For the packet used to send the metadata, see [Entity Metadata](beta/040-entity-metadata.md).

## Format
To read entity metadata, follow these steps:
1. Read an unsigned byte.
1. If the byte is `127`, stop reading.
1. The ID of the metadata value is the bottom 5 bits, equal to `byte & 31`.
1. The data type is the top 5 bits, equal to `byte >> 5`. See below for a list of all data types.

## Data Types
| ID | Type |
| --- | --- | 
| 0 | Byte |
| 1 | Short |
| 2 | Integer |
| 3 | Float |
| 4 | String |
| 5 | Item Stack |
| 6 | Coordinates |

> [!NOTE]
> Strings are serialized with the modified UCS-2 string format. Coordinates are written as three integers, while item stacks are written as a short (item/block ID), byte (quantity), and another short (metadata). Everything else uses regular Java serialization.

## Mobs
<table>
    <tr>
        <th>Name</th>
        <td>Metadata</td>
    </tr>
    <tr>
        <td>Entity<sup>[?](#flags)</sup></td>
        <td>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Type</th>
                    <th>Name</th>
                </tr>
                <tr>
                    <td>16</td>
                    <td>Byte</td>
                    <td>Sneaking?</td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td>Player</td>
        <td>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Type</th>
                    <th>Name</th>
                </tr>
                <tr>
                    <td>16</td>
                    <td>Byte</td>
                    <td>Unused</td>
                </tr>
            </table>
        </td>
    </tr>
    </tr>
        <td>Pig</td>
        <td>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Type</th>
                    <th>Name</th>
                </tr>
                <tr>
                    <td>16</td>
                    <td>Byte</td>
                    <td>Saddled?</td>
                </tr>
            </table>
        </td>
    </tr>
    </tr>
        <td>Creeper</td>
        <td>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Type</th>
                    <th>Name</th>
                </tr>
                <tr>
                    <td>16</td>
                    <td>Byte</td>
                    <td>Fuse[^2]</td>
                </tr>
                <tr>
                    <td>17</td>
                    <td>Byte</td>
                    <td>Charged?</td>
                </tr>
            </table>
        </td>
    </tr>
    </tr>
        <td>Sheep</td>
        <td>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Type</th>
                    <th>Name</th>
                </tr>
                <tr>
                    <td>16</td>
                    <td>Byte</td>
                    <td>Sheared? / Color[^1]</td>
                </tr>
            </table>
        </td>
    </tr>
    </tr>
        <td>Slime</td>
        <td>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Type</th>
                    <th>Name</th>
                </tr>
                <tr>
                    <td>16</td>
                    <td>Byte</td>
                    <td>Size</td>
                </tr>
            </table>
        </td>
    </tr>
    </tr>
        <td>Ghast</td>
        <td>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Type</th>
                    <th>Name</th>
                </tr>
                <tr>
                    <td>16</td>
                    <td>Byte</td>
                    <td>Attacking?</td>
                </tr>
            </table>
        </td>
    </tr>
    </tr>
        <td>Wolf</td>
        <td>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Type</th>
                    <th>Name</th>
                </tr>
                <tr>
                    <td>16</td>
                    <td>Byte</td>
                    <td>Sitting?</td>
                </tr>
                <tr>
                    <td>17</td>
                    <td>String</td>
                    <td>Owner</td>
                </tr>
                <tr>
                    <td>18</td>
                    <td>Integer</td>
                    <td>Health</td>
                </tr>
            </table>
        </td>
    </tr>
</table>

### Flags
All entities extending the `Entity` class must support this bit field at metadata ID 0. In later versions, this is also used for sprinting and eating/drinking.

To get the flag at an ID, you can use `value & mask != 0`.

| ID | Bit Mask | Name |
| --- | --- | --- |
| 0 | 0x01 | Burning? |
| 1 | 0x02 | Sneaking? |
| 2 | 0x04 | Riding? |

## Relevant Classes
- `DataWatcher.java`
    - Watches metadata values for changes and sends packets.
- `WatchableObject.java`
    - Represents a metadata value that can be changed.
- `Packet40EntityMetadata.java`
    - The packet that notifies the client of metadata changes in a mob.

<hr>

[^1]: You can use a `0x10` bit mask for shearedness and `0x0F` for color.

[^2]: `1` for blowing up, `-1` otherwise.