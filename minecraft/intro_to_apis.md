# Introduction to APIs

These cons are relevant to all toolchains/APIs, unless stated otherwise.
- Cons:
  - For versions <1.7.10, **very** limited block IDs. You get a max of 255, and about 96 of those are claimed by vanilla already.
  - ID conflicts will almost certainly be a constant if you're trying to add a bunch of mods together.

# JAR Mod
- Pros
  - Easy to get into without much Java knowledge, for the most part.
  - Works equally as well across any java IDE you can think of.
- Cons
  - The development environment is a hassle to sensibly attach to something like git. (*important for code versioning and backups!*)
  - Cross mod compatibility is a coin flip at the best of times, though mods that function purely on ModLoader/Forge/Shockah APIs are generally very compatible, exlcuding ID conflicts.
  - If you care about compatibility, you will likely be juggling compatibility patches a lot if you edit any game classes.

### ModLoader
- Pros
  - Simple API and very easy to learn.
- Cons
  - The API is very limited and beyond adding items and blocks, and is generally hard to do anything fancy with unless you modify game classes.
  - Has a limited sprite atlas, you only get a relative handful of textures before the game crashes. Can be worked around with other mods like InfSprites, but these solutions are hardly ideal.
- Mixed
  - IDResolver can help with ID conflicts, but some mods break in nasty ways, so you'll likely still be manually juggling some IDs with certain mods.

## ModLoaderMP
- Pros
  - Simple and easy to learn, also is an expansion of ModLoader itself.
- Cons
  - Can be touchy at times.

### Forge
- Pros
  - An extension of both ModLoader and ModLoaderMP. If a mod is made for one of the above, and doesn't edit any classes, it's basically assured it'll work on forge.
    - This information is less accurate post r1.0, but for most ModLoader mods, this still applies.
- Cons
  - It's pretty intrusive and edits many classes, though there are many compatibility patches that exist now to bridge gaps.

### ShockAhPI
- Pros
  - Is *the* dimensions API for JAR modding, at least until forge for r1.2.
- Cons
  - Compatibility is very touch and go for some more popular mods, at least in b1.7.3, though patches exist these days.

# Fabric-Based
- Pros
  - You get access to mixins, which allow you to modify game classes while still maintaining excellent cross-mod compatibility.
- Cons
  - Mixins are hard to write without using IntelliJ IDEA and the Minecraft Development plugin.
  - Mixins *can* be hard to triage if they break, though tooling has been getting markedly better.#
  - Requires at least a basic idea on how Java works before you can do anything.

### Babric
- Pros
  - Has merged mappings, which means client and server code can exist in the same class files, and play nicely on client and server without having to ship separate client/server versions.
- Cons
  - Basically no API beyond client/server initialization hooks.
  - Only exists for b1.7.3.

### StationAPI
- Pros
  - Built on top of Babric's foundations, and compatibility with Babric mods is generally expected.
  - Has automatic ID resolving, you don't have to worry about mods stepping on each other's toes.
  - Has effectively infinite IDs, meaning you can keep your code much nicer by just adding more blocks instead of having to do hacky metadata block id saving techniques.
  - Big and general purpose, you'll be able to do just about whatever you want, within standard modding expectations.
- Cons
  - The current flattening implmentation will noticeably affect your game performance unless you're on relatively mid-end hardware or above.
  - Intrusive. Doesn't play particularly nicely with other modding APIs unless they're made with StAPI in mind.
  - Still in alpha, and has usually subtle bugs that can cause headaches from time to time.
  - You will likely have to update your mod at least a couple times a year to keep compatibility with the latest StAPI versions, depending on what changes.

### Ornithe
- Pros
  - Works on every version of minecraft.
  - Has an official, maintained API.
- Cons
  - Doesn't have stable merged mappings for versions <1.3.1
  - Their API is very barebones, but is still mostly superior to modloader in just about every aspect, ignoring the benefits of mixins.
