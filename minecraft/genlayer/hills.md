# GenLayerHills *(12w01a/1.1+)*

`GenLayerHills` adds hills variants in the middle of biomes that have them with a 1 in 3 chance.

## Pseudocode
```lua
hills = {
    Biome.DESERT: Biome.DESERT_HILLS,
    Biome.FOREST: Biome.FOREST_HILLS,
    Biome.TAIGA: Biome.TAIGA_HILLS,
    Biome.PLAINS: Biome.FOREST,
    Biome.ICE_PLAINS: Biome.ICE_MOUNTAINS,
    Biome.JUNGLE: Biome.JUNGLE_HILLS -- (1.2/12w03a+)
}

if input.neighbors(x, z).allEqual(biome) and randbool(3) and biome in hills {
    biome = hills[biome]
}
```

## Example
World Seed: Glacier<br>
Seed: N/A<br>
X: 0<br>
Z: 0<br>

### Input
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![4](/assets/biome/4.png)|
|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|
|![2](/assets/biome/2.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![4](/assets/biome/4.png)|
|![2](/assets/biome/2.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|
|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|
|![6](/assets/biome/6.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|
|![6](/assets/biome/6.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|
|![6](/assets/biome/6.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|

### Output
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![2](/assets/biome/2.png)|![17](/assets/biome/17.png)|![2](/assets/biome/2.png)|![21](/assets/biome/21.png)|![22](/assets/biome/22.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![4](/assets/biome/4.png)|
|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|
|![2](/assets/biome/2.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![4](/assets/biome/4.png)|
|![2](/assets/biome/2.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![22](/assets/biome/22.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|
|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![21](/assets/biome/21.png)|
|![6](/assets/biome/6.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|
|![6](/assets/biome/6.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|
|![6](/assets/biome/6.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![22](/assets/biome/22.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|
