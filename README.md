# Golden Age Wiki
The Golden Age modding wiki is a free and open-source wiki for Minecraft versions from rd-132211 to 1.5.2 that focuses on documenting how Minecraft itself works and best practices for modding such versions.

## Tutorials
### Setting up
- [Introduction to APIs](minecraft/intro_to_apis.md)
- [Setting up a MCP modding environment](mcp/setting_up.md)
- [Setting up a Fabric modding environment](fabric/setting_up.md)

### Blocks
- [Adding a block with MCP]()
- [Adding a block with ModLoader]()
    - [Using Forge texture atlases]()
- [Adding a block with Station API]()
- [Block entities]()

### Items
- [Adding an item with MCP]()
- [Adding an item with ModLoader]()
- [Using metadata to save block IDs]()

## Documentation
### Save formats
- [Classic save format](minecraft/save_format/classic_save_format.md)
    - Introduced in rd-132211 and discontinued in Indev 0.31 20100114.
- [Indev save format](minecraft/save_format/classic_save_format.md)
    - Introduced in Indev 0.31 20100122 and discontinued in Infdev 20100325.
- [Infdev 20100624 save format](minecraft/save_format/624_save_format.md)
    - Introduced in Infdev 20100624 and immediately discontinued due to file size concerns.
- ["Alpha" save format](minecraft/save_format/alpha_save_format.md)
    - Introduced in Infdev 20100327 and discontinued in Beta 1.3.
- [McRegion save format](minecraft/save_format/mcregion_save_format.md)
    - Introduced in Beta 1.3 and discontinued in Release 1.2.
- [Anvil save format](minecraft/save_format/anvil_save_format.md)
    - Introduced in 12w07a for Release 1.2.1 and is still in use.

### Networking
- [Vanilla packets]()
- [Adding custom packets with MCP]()
- [Adding custom packets with ModLoaderMP]()
- [Adding custom packets with Station API]()

## Contributing
### Submitting a pull request
1. Fork the repository and clone it. (`git clone <url>`)
2. Edit the wiki and add your changes. (`git add .`)
3. Commit your changes. (`git commit -m "adds X"`)
4. Push to your fork. (`git push`)
5. Open a pull request.

<hr>

> [!NOTE]
> This project is not related or affiliated with r/GoldenAgeMinecraft, Mojang, or Microsoft. Except where otherwise stated, this wiki is provided under the terms of the Creative Commons Zero 1.0 Universal license (CC0). For more information, please see the [license file](LICENSE).