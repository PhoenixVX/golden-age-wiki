# GenLayerShore *(12w01a/1.1+)*

`GenLayerShore` adds beach and edge biomes to the world. Mushroom islands are surrounded by mushroom island shore instead of ocean, extreme hills are surrounded by extreme hills edge and any other biome with a neighboring ocean that is not an ocean, river or swampland is turned into a beach.

## Pseudocode
```lua
neighbors = input.neighbors(x, z)

if biome == Biome.MUSHROOM_ISLAND {
    if Biome.OCEAN in neighbors {
        biome = Biome.MUSHROOM_ISLAND_SHORE
    }
} else if biome == Biome.EXTREME_HILLS {
    if not neighbors.allEqual(Biome.EXTREME_HILLS) {
        biome = Biome.EXTREME_HILLS_EDGE
    }
} else if biome not in [Biome.OCEAN, Biome.RIVER, Biome.SWAMPLAND] {
    if Biome.OCEAN in neighbors {
        biome = Biome.BEACH
    }
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
|![2](/assets/biome/2.png)|![21](/assets/biome/21.png)|![4](/assets/biome/4.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![4](/assets/biome/4.png)|![4](/assets/biome/4.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![21](/assets/biome/21.png)|![6](/assets/biome/6.png)|![21](/assets/biome/21.png)|![6](/assets/biome/6.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![4](/assets/biome/4.png)|
|![6](/assets/biome/6.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![3](/assets/biome/3.png)|![1](/assets/biome/1.png)|![4](/assets/biome/4.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![6](/assets/biome/6.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![6](/assets/biome/6.png)|![1](/assets/biome/1.png)|![2](/assets/biome/2.png)|![6](/assets/biome/6.png)|![0](/assets/biome/0.png)|
|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![6](/assets/biome/6.png)|![5](/assets/biome/5.png)|![5](/assets/biome/5.png)|![6](/assets/biome/6.png)|
|![6](/assets/biome/6.png)|![1](/assets/biome/1.png)|![21](/assets/biome/21.png)|![6](/assets/biome/6.png)|![4](/assets/biome/4.png)|![21](/assets/biome/21.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|
|![2](/assets/biome/2.png)|![5](/assets/biome/5.png)|![3](/assets/biome/3.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![4](/assets/biome/4.png)|
|![6](/assets/biome/6.png)|![4](/assets/biome/4.png)|![2](/assets/biome/2.png)|![21](/assets/biome/21.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![3](/assets/biome/3.png)|

### Output
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![16](/assets/biome/16.png)|![21](/assets/biome/21.png)|![4](/assets/biome/4.png)|![2](/assets/biome/2.png)|![20](/assets/biome/20.png)|![4](/assets/biome/4.png)|![16](/assets/biome/16.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![16](/assets/biome/16.png)|![6](/assets/biome/6.png)|![21](/assets/biome/21.png)|![6](/assets/biome/6.png)|![1](/assets/biome/1.png)|![16](/assets/biome/16.png)|![16](/assets/biome/16.png)|
|![6](/assets/biome/6.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![20](/assets/biome/20.png)|![1](/assets/biome/1.png)|![16](/assets/biome/16.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![6](/assets/biome/6.png)|![20](/assets/biome/20.png)|![20](/assets/biome/20.png)|![6](/assets/biome/6.png)|![1](/assets/biome/1.png)|![2](/assets/biome/2.png)|![6](/assets/biome/6.png)|![0](/assets/biome/0.png)|
|![2](/assets/biome/2.png)|![20](/assets/biome/20.png)|![20](/assets/biome/20.png)|![2](/assets/biome/2.png)|![6](/assets/biome/6.png)|![5](/assets/biome/5.png)|![5](/assets/biome/5.png)|![6](/assets/biome/6.png)|
|![6](/assets/biome/6.png)|![1](/assets/biome/1.png)|![21](/assets/biome/21.png)|![6](/assets/biome/6.png)|![16](/assets/biome/16.png)|![21](/assets/biome/21.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|
|![2](/assets/biome/2.png)|![5](/assets/biome/5.png)|![20](/assets/biome/20.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![20](/assets/biome/20.png)|![20](/assets/biome/20.png)|![4](/assets/biome/4.png)|
|![6](/assets/biome/6.png)|![4](/assets/biome/4.png)|![2](/assets/biome/2.png)|![16](/assets/biome/16.png)|![0](/assets/biome/0.png)|![16](/assets/biome/16.png)|![0](/assets/biome/0.png)|![20](/assets/biome/20.png)|
