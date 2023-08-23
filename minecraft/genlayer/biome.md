# GenLayerBiome *(b1.8-1.1: GenLayerVillageLandscape)*

`GenLayerBiome` applies biomes to terrain. Oceans *(b1.9-pre+ and mushroom islands)* are ignored, *(b1.9-pre+ plains) (b1.8 while other spaces)* get turned into any of the game's available biomes *(b1.9-pre+ and other spaces get turned into ice plains)*.

## Biomes
- ![2](/assets/biome/2.png) Desert
- ![4](/assets/biome/4.png) Forest
- ![3](/assets/biome/3.png) Extreme Hills
- ![6](/assets/biome/6.png) Swampland
- ![1](/assets/biome/1.png) Plains
- ![5](/assets/biome/5.png) Taiga
- ![21](/assets/biome/21.png) *(1.2/12w03a+ Jungle)*

## Pseudocode
### Beta 1.8
```lua
if biome != Biome.OCEAN {
    biome = randchoice(biomes)
}
```
### Beta 1.9 Prerelease+
```lua
if biome not in [Biome.OCEAN, Biome.MUSHROOM_ISLAND] {
    if biome == Biome.PLAINS {
        biome = randchoice(biomes)
    } else {
        biome = Biome.ICE_PLAINS
    }
}
```

## Example
World Seed: Biomefest<br>
Seed: 200<br>
X: 0<br>
Z: 0<br>

### Input
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![12](/assets/biome/12.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|
|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|
|![14](/assets/biome/14.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|

### Output *(b1.8-1.1)*
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![5](/assets/biome/5.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![1](/assets/biome/1.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|
|![4](/assets/biome/4.png)|![2](/assets/biome/2.png)|![6](/assets/biome/6.png)|![1](/assets/biome/1.png)|![4](/assets/biome/4.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|
|![2](/assets/biome/2.png)|![1](/assets/biome/1.png)|![5](/assets/biome/5.png)|![5](/assets/biome/5.png)|![1](/assets/biome/1.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|
|![2](/assets/biome/2.png)|![4](/assets/biome/4.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![6](/assets/biome/6.png)|![5](/assets/biome/5.png)|![3](/assets/biome/3.png)|![12](/assets/biome/12.png)|
|![6](/assets/biome/6.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![4](/assets/biome/4.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![4](/assets/biome/4.png)|
|![0](/assets/biome/0.png)|![4](/assets/biome/4.png)|![2](/assets/biome/2.png)|![1](/assets/biome/1.png)|![3](/assets/biome/3.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![3](/assets/biome/3.png)|![5](/assets/biome/5.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![6](/assets/biome/6.png)|![5](/assets/biome/5.png)|
|![14](/assets/biome/14.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![2](/assets/biome/2.png)|![1](/assets/biome/1.png)|![3](/assets/biome/3.png)|![5](/assets/biome/5.png)|

### Output *(1.2/12w03a+)*
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![1](/assets/biome/1.png)|![5](/assets/biome/5.png)|![4](/assets/biome/4.png)|![21](/assets/biome/21.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|
|![2](/assets/biome/2.png)|![5](/assets/biome/5.png)|![1](/assets/biome/1.png)|![3](/assets/biome/3.png)|![6](/assets/biome/6.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|
|![1](/assets/biome/1.png)|![21](/assets/biome/21.png)|![4](/assets/biome/4.png)|![5](/assets/biome/5.png)|![5](/assets/biome/5.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|
|![6](/assets/biome/6.png)|![4](/assets/biome/4.png)|![3](/assets/biome/3.png)|![21](/assets/biome/21.png)|![5](/assets/biome/5.png)|![2](/assets/biome/2.png)|![4](/assets/biome/4.png)|![12](/assets/biome/12.png)|
|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|![4](/assets/biome/4.png)|![4](/assets/biome/4.png)|![4](/assets/biome/4.png)|![21](/assets/biome/21.png)|![2](/assets/biome/2.png)|![3](/assets/biome/3.png)|
|![0](/assets/biome/0.png)|![4](/assets/biome/4.png)|![2](/assets/biome/2.png)|![6](/assets/biome/6.png)|![21](/assets/biome/21.png)|![4](/assets/biome/4.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![1](/assets/biome/1.png)|![5](/assets/biome/5.png)|![5](/assets/biome/5.png)|![3](/assets/biome/3.png)|
|![14](/assets/biome/14.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![4](/assets/biome/4.png)|![5](/assets/biome/5.png)|![2](/assets/biome/2.png)|![5](/assets/biome/5.png)|![2](/assets/biome/2.png)|
