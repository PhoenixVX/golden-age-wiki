# Setting up MCP
MCP stands for Mod Coder Pack/Minecraft Coder Pack. MCP was the first way to mod Minecraft that did not consist of simple bytecode edits, but full on modification to the Minecraft source code.

Setting up a modding environment using MCP can be quite troublesome for a first time beginner due to the fact that MCP was made to work with the old Minecraft launcher and also because the servers that MCP used to use to check for updates have also went down. As such, numerous alternatives have popped up to fill the void that MCP once filled.

### MCP
1. Download the version of MCP for the Minecraft version you wish to mod from the [wiki](https://minecraft.fandom.com/wiki/Tutorials/Programs_and_editors/Mod_Coder_Pack).
1. Extract the resulting ZIP file.
1. Move the resulting folder to a suitable working directory.
1. If the version you are modding is new enough, you can simply click `decompile.bat` or `decompile.sh` and have a MCP environment setup after a few minutes of decompilation. If this is successful, congratulations, you are now ready to mod!
1. [PLACEHOLDER]

### RetroMCP-Java
As said above, RetroMCP-Java is one such alternative to MCP that helps to enable easy mod development without having to worry about the limitations of original MCP.

1. Download the latest version of RetroMCP-Java, available at [RetroMCP-Java Releases](https://github.com/MCPHackers/RetroMCP-Java).
1. Move the JAR file to a suitable working directory.
1. If you downloaded the GUI version, simply double-click the JAR to get started. If not, invoke a terminal in the same folder and run `java -jar RetroMCP-Java-CLI.jar`.
1. To download and setup a version, click the "Versions: " button in the GUI or run `setup` in the terminal.
1. Select or type a version name (e.g. `b1.7.3`)
1. If you wish to use an API/decompile a mod, put the necessary files inside jars/minecraft.jar.
1. Click or run the `decompile` task to begin decompiling.
1. If the `decompile` tasks fails, you can fix the issues using Eclipse/Intellij, then run `updatemd5hashes`, which updates the hashes used for reobfuscation (which enables your mod to play nicely with other mods).

### MCP-LTS (**Deprecated**)
1. Download the latest version from [GitHub](https://github.com/ModificationStation/1.7.3-LTS) by clicking Code->Download ZIP.
1. Extract the resulting ZIP file.
1. Move the folder to a suitable working directory.
1. Open up Command Prompt / Terminal
1. Type `setup.bat` on Windows or `setup.sh` if on Mac OS X or Linux.
1. Accept the prompts that come up.
1. Select the version you wish to mod.
1. Type `decompile` and wait for it to complete.
1. Congratulations!

### RetroMCP-Python (**Deprecated**)
