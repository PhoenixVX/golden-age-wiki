# GenLayerRiver

`GenLayerRiver` places rivers on the edges of spaces with unique neighbors. It takes in data generated from [`GenLayerRiverInit`](/minecraft/genlayer/riverinit.md).

## Pseudocode
```lua
neighbors = input.neighbors(x, z)

if biome != 0 and 0 not in neighbors and neighbors.allEqual(biome) {
    biome = -1
} else {
    biome = Biome.RIVER
}
```

## Example
*Note: The biome backgrounds shown in the input are not true biomes*<br>
World Seed: Staggoland<br>
Seed: N/A<br>
X: 4<br>
Z: 2<br>

### Input
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|
|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|
|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|
|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|
|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|
|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|
|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|
|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|

### Output
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|
|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|
|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|
