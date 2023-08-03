# Setting up MCP
MCP stands for Mod Coder Pack/Minecraft Coder Pack. MCP was the first way to mod Minecraft that did not consist of simple bytecode edits, but full on modification to the Minecraft source code.

Setting up a modding environment using MCP can be quite troublesome for a first time beginner due to the fact that MCP was made to work with the old Minecraft launcher and also because the servers that MCP used to use to check for updates have also went down. As such, numerous alternatives have popped up to fill the void that MCP once filled.

### MCP
1. Download the version of MCP for the Minecraft version you wish to mod from the [wiki](https://minecraft.fandom.com/wiki/Tutorials/Programs_and_editors/Mod_Coder_Pack).
2. Make sure to not click on the advertisements on the website. Generally speaking, Ad.fly is a reputable download redirector with advertisements that are not dangerous, but it is still ill-advised to click on anything else than the blue download button.
3. Extract the resulting ZIP file.
4. Move the resulting folder to a suitable working directory.
5. If the version you are modding is new enough, you can simply click `decompile.bat` or `decompile.sh` and have a MCP environment setup after a few minutes of decompilation. If this is successful, congratulations, you are now ready to mod!
6. [PLACEHOLDER]

### RetroMCP-Java
As said above, RetroMCP-Java is one such alternative to MCP that helps to enable easy mod development without having to worry about the limitations of original MCP.

1. Download the latest version of RetroMCP-Java, available at [RetroMCP-Java Releases](https://github.com/MCPHackers/RetroMCP-Java).
2. Move the JAR file to a suitable working directory.
3. If you downloaded the GUI version, simply double-click the JAR to get started. If not, invoke a terminal in the same folder and run `java -jar RetroMCP-Java-CLI.jar`.
4. To download and setup a version, click the "Versions: " button in the GUI or run `setup` in the terminal.
5. Select or type a version name (e.g. `b1.7.3`)
6. If you wish to use an API/decompile a mod, put the necessary files inside jars/minecraft.jar.
7. Click or run the `decompile` task to begin decompiling.
8. If the `decompile` tasks fails, you can fix the issues using Eclipse/Intellij, then run `updatemd5hashes`, which updates the hashes used for reobfuscation (which enables your mod to play nicely with other mods).

### MCP-LTS (**Deprecated**)
1. Download the latest version from [GitHub](https://github.com/ModificationStation/1.7.3-LTS) by clicking Code->Download ZIP.
2. Extract the resulting ZIP file.
3. Move the folder to a suitable working directory.
4. Open up Command Prompt / Terminal
5. Type `setup.bat` on Windows or `setup.sh` if on Mac OS X or Linux.
6. Accept the prompts that come up.
7. Select the version you wish to mod.
8. Type `decompile` and wait for it to complete.
9. Congratulations!

### RetroMCP-Python (**Deprecated**)
