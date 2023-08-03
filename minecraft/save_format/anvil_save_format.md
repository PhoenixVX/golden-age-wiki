# Anvil Save Format
Anvil is a save format introduced in snapshot 12w07a for Release 1.2.1, and is based off the [McRegion](mcregion_save_format.md) save format. This format is still used today though there are numerous differences in the contents of the region and chunk files.

## File Structure
Similar to the McRegion save format, Region files are stored within the `region` folder of the world. In the Anvil save format, each Region can hold up to 32x32 chunks, each indexed by their position inside the region.

## File Header

## Chunk Format
