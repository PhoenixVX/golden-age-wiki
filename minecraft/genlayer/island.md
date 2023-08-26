# GenLayerIsland *(b1.8-r1.1: LayerIsland)*

`GenLayerIsland` is the first GenLayer called in world generation. Unlike other generation layers, `GenLayerIsland` does not take in any inputs. It returns a zoomed out map of biomes where 1 in 10 biomes are plains and the rest are ocean. In addition to this, the biome at (0, 0) is always a plains biome.

## Pseudocode
```lua
biome = Biome.OCEAN
if randbool(5) == 0 or x == 0 and z == 0 {
    biome = Biome.PLAINS
}
```

## Example
World Seed: Glacier<br>
Seed: 1<br>
X: 0<br>
Z: 0<br>

### Output
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
