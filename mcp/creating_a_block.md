> [!NOTE]
> Before you follow this guide, make sure you have decent knowledge of Java and have already [decompiled Minecraft](setting_up.md). If you are using RetroMCP-Java, you may want to enable "keep resources" in order to get the `terrain.png` texture used for the tutorial.

# Creating a Block
This guide will explain how to make a simple flower block and making it generate in the world.

> You can optionally use [this flower texture](/assets/wither_rose.png) created by Tyy on Modification Station for the tutorial.

1. Open your IDE of choice and create a new class extending named `BlockWitherRose` with this code:
```java
public class BlockWitherRose extends BlockFlower {
    public BlockWitherRose(int id, int textureIndex) {
        super(id, textureIndex);
    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        if (entity instanceof EntityLiving) {
            EntityLiving livingEntity = (EntityLiving) entity;
            livingEntity.heal(-1);
        }
    }
}
```
The `onEntityCollidedWithBlock` will check when an animal/mob touches the block and will damage them by 1 heart.

2. Open the `Block` class and register the block using this code:
```java
public static final Block WITHER_ROSE = new BlockWitherRose(BLOCK_ID, TEXTURE_INDEX)
        .setStepSound(soundGrassFootstep)
        .setBlockName("wither_rose");
```
`setStepSound` sets the sound that the block makes to a grass/plant sound, and `setBlockName` will set the translation key to use so the block can have a name.

3. To add a name to your block, edit the `lang/en_US.lang` file to have the following entry: 
```properties
tile.wither_rose.name=Wither Rose
```

4. Make sure to replace `BLOCK_ID` with the block ID you want to assign the block to. The block ID can be between 1 and 255 and must not be used by any other blocks. `TEXTURE_INDEX` is the texture slot in `terrain.png` where your block texture is located. Note that the top left of the texture atlas is slot 0 and the bottom right is slot 255.

5. To make your flower generate in the world, open `ChunkProviderGenerate` and search for where `WorldGenFlowers` is used, and add this code after it.
```java
if (this.rand.nextInt(4) == 0) {
    WorldGenFlowers generator = new WorldGenFlowers(Block.WITHER_ROSE.blockID);
    int x = i4 + this.rand.nextInt(16) + 8;
    int z = i5 + this.rand.nextInt(16) + 8;
    generator.generate(this.worldObj, this.rand, x, this.rand.nextInt(128), z);
}
``` 

6. When you recompile and start the game, you should notice your flower generating in the world.

## Builder Methods
This is a list of methods you can use when creating your block in order to customize its properties.
- `disableNeighborNotifyOnMetadataChange`
- `setStepSound`
- `setLightOpacity`
- `setLightValue`
- `setResistance`
- `setHardness`
- `setBlockUnbreakable`
- `setTickOnLoad`
- `setBlockBounds`
- `setBlockName`
- `disableStats`

## Overrideable Methods
This is a list of methods that you can optionally override in your block class to give your block more functionality.
- `initializeBlock` - Anything you need to do after all the blocks have been registered can go here.
- `renderAsNormalBlock`
- `getRenderType` - This method makes your block render differently. See [Render Types](/minecraft/render_types.md).
- `shouldSideBeRendered`
- `getIsBlockSolid`
- `getBlockTexture`
- `getBlockTextureFromSideAndMetadata`
- `getBlockTextureFromSide`
- `getCollidingBoundingBoxes`
- `getSelectedBoundingBoxFromPool`
- `isOpaqueCube`
- `updateTick`
- `randomDisplayTick`
- `onBlockDestroyedByPlayer`
- `onNeighborBlockChange`
- `tickRate`
- `onBlockAdded`
- `onBlockRemoval`
- `quantityDropped`
- `idDropped`
- `damageDropped`
- `onBlockDestroyedByExplosion`
- `getRenderBlockPass`
- `canPlaceBlockOnSide`
- `canPlaceBlockAt`
- `blockActivated`
- `onEntityWalking`
- `onBlockPlaced`
- `onBlockClicked`
- `getRenderColor`
- `colorMultiplier`
- `isPoweringTo`
- `canProvidePower`
- `onEntityCollidedWithBlock`
- `isIndirectlyPoweringTo`
- `harvestBlock`
- `onBlockPlacedBy`