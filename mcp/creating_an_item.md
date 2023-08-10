> [!NOTE]
> Before you follow this guide, make sure you have decent knowledge of Java and have already [decompiled Minecraft](setting_up.md). If you are using RetroMCP-Java, you may want to enable "keep resources" in order to get the `gui/items.png` texture used for this tutorial.

# Creating a Custom Item

## Builder Methods
This is a list of methods you can use when creating your item in order to customize its properties.
- `setUnlocalizedName`
- `setCreativeTab`
- `setPotionEffect`
- `setAlwaysEdible`
- `setMaxStackSize`
- `setContainerItem`
- `setFull3D`
- `setHasSubTypes`
- `setMaxDamage`

## Overridable Methods
This is a list of methods that you can optionally override in your item class to give your item more functionality.
- `getSpriteNumber`
- `getIconFromDamage`
- `getIconIndex`
- `onItemUse`
- `getStrVsBlock`
- `onItemRightClick`
- `onEaten`
- `getMetadata`
- `hitEntity`
- `onBlockDestroyed`
- `getDamageVsEntity`
- `canHarvestBlock`
- `itemInteractionForEntity`
- `shouldRotateAroundWhenRendering`
- `doesContainerItemLeaveCraftingGrid`
- `getShareTag`
- `onUpdate`
- `onCreated`
- `isMap`
- `getItemUseAction`
- `getMaxItemUseDuration`
- `onPlayerStoppedUsing`
- `addInformation`
- `hasEffect`
- `isItemTool`
- `getItemEnchantability`
- `requiresMultipleRenderPasses`
- `getIconFromDamageForRenderPass`
- `getSubItems`
- `func_82788_x`
- `getIsRepairable`
- `registerIcons`