# NBT Types

| Type ID | Type Name | MCP Class Name | Payload Size (Bytes) | Description |
| ------- | -------- | -------------- | -------------------- | ----------- |
| 0 | TAG_End | NBTTagEnd | 0 | Signifies the end of a TAG_Compound. It is only ever used inside a TAG_Compound, and is not named despite being in a TAG_Compound. |
| 1 | TAG_Byte | NBTTagByte | 1 | A single signed byte. |
| 2 | TAG_Short | NBTTagShort | 2 | A single signed, big endian 16 bit integer. |
| 3 | TAG_Int | NBTTagInt | 4 | A single signed, big endian 32 bit integer. |
| 4 | TAG_Long | NBTTagLong | 8 | A single signed, big endian 64 bit integer. |
| 5 | TAG_Float | NBTTagFloat | 4 | A single, big endian [IEEE-754](http://en.wikipedia.org/wiki/IEEE_754-2008) single-precision floating point number. |
| 6 | TAG_Double | NBTTagDouble | 8 | A single, big endian [IEEE-754](http://en.wikipedia.org/wiki/IEEE_754-2008) double-precision floating point number. |
| 7 | TAG_Byte_Array | NBTTagByteArray | ... | A length-prefixed array of signed bytes. The prefix is a signed integer (thus 4 bytes). |
| 8 | TAG_String | NBTTagString | ... | A length-prefixed [modified UTF-8](https://docs.oracle.com/javase/8/docs/api/java/io/DataInput.html#modified-utf-8) string. The prefix is an unsigned short (thus 2 bytes) signifying the length of the string in bytes. |
| 9 | TAG_List | NBTTagList | ... | A list of **nameless** tags, all of the same type. The list is prefixed with the `Type ID` of the items it contains (thus 1 byte), and the length of the list as a signed integer (a further 4 bytes). If the length of the list is 0 or negative, the type may be 0 (TAG_End) but otherwise it must be any other type. (The notchian implementation uses `TAG_End` in that situation, but another reference implementation by Mojang uses 1 instead; parsers should accept any type if the length is <= 0). |
| 10 | TAG_Compound | NBTTagCompound | ... | Effectively a list of **named** tags. Order is not guaranteed. |
| 11 | TAG_Int_Array | NBTTagIntArray | ... | A length-prefixed array of **signed** integers. The prefix is a signed integer (thus 4 bytes) and indicates the number of 4 byte integers. |
| 12 | TAG_Long_Array | NBTTagLongArray | ... | A length-prefixed array of **signed** longs. The prefix is a signed integer (thus 4 bytes) and indicates the number of 8 byte longs. |