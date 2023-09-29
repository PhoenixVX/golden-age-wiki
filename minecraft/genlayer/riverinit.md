# GenLayerRiverInit

`GenLayerRiverInit` creates the initial setup for rivers. Ocean spaces are kept as oceans whereas land spaces can be set to 2 or 3 with a 50/50 chance.

## Pseudocode
```lua
if biome != Biome.OCEAN {
    biome = randint(2) + 2
}
```

## Example
*Note: The biome backgrounds shown in the output are not true biomes*<br>
World Seed: Staggoland<br>
Seed: 100<br>
X: 0<br>
Z: 0<br>

### Input
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![12](/assets/biome/12.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|

### Output
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|
|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|
|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|
|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![0](/assets/biome/0.png)|![3](/assets/biome/3.png)|
|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![0](/assets/biome/0.png)|
|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|
