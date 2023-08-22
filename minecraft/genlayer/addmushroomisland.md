# GenLayerAddMushroomIsland *(b1.9-pre+)*

`GenLayerAddMushroomIsland` changes 1 in 100 spaces of ocean surrounded by more ocean into mushroom islands.

## Pseudocode
```lua
if biome == Biome.OCEAN and input.neighbors(x, z).allEqual(Biome.OCEAN) and randbool(100) {
    biome = Biome.MUSHROOM_ISLAND
}
```

## Example
World Seed: 4<br>
Seed: 5<br>
X: 0<br>
Z: 0<br>

### Input
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|

### Output
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![14](/assets/biome/14.png)|
|![0](/assets/biome/0.png)|![14](/assets/biome/14.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
