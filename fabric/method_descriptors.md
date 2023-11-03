# Method Descriptors
Method descriptors are an important part of mixins, and it is essential to understand them if you want to code mixins easily. A method descriptor is composed of the method name, its arguments in parenthesis, followed by its return types.

## Return Types
Here is a list of arguments and return types you can use. `V` (void) is used to indicate that a method does not return anything. 

| Character | Type |
| --- | --- |
| B | `byte` |
| C | `char` |
| D | `double` |
| F | `float` |
| I | `int` |
| J | `long` |
| LClassName; | An instance of `ClassName`. |
| S | `short` |
| Z | `boolean` |
| Type[ | A prefix to indicate an array of `Type`. | 

## Special Methods
Unlike Java, where a constructor's name is always the class name, in bytecode the name of a constructor is `<init>`.
A static block is similar except with the name `<clinit>`.

## Examples
**Method**
```java
Block createNewBlock(String name, float hardness, float resistance);
```

**Descriptor**
```
createNewBlock(Ljava/lang/String;FF)Lnet/minecraft/block/Block
```

---

**Method**
```java
Player[] getPlayersAt(int x, int y, int z);
```

**Descriptor**
```
getPlayersAt(III)[Lnet/minecraft/entity/Player;
```

---

**Method**
```java
void setWorldInfo(long seed);
```

**Descriptor**
```
setWorldInfo(J)V
```
