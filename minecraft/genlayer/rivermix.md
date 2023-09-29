# GenLayerRiverMix

`GenLayerRiverMix` mixes rivers into biomes using two inputs. Oceans are ignored, *(b1.9-pre+ rivers in ice plains are converted to frozen rivers, rivers in mushroom islands and mushroom island shores are converted to mushroom island shores)* and normal river biomes are placed in other biomes.

## Pseudocode
```lua
if biome != Biome.OCEAN and river >= 0 {
    if biome == Biome.ICE_PLAINS {
        biome = Biome.FROZEN_RIVER
    } else if biome in [Biome.MUSHROOM_ISLAND, Biome.MUSHROOM_ISLAND_SHORE] {
        biome = Biome.MUSHROOM_ISLAND_SHORE
    } else {
        biome = river
    }
}
```

## Example
World Seed: Staggoland<br>
Seed: N/A<br>
X: 4<br>
Z: 2<br>

### Input (Biomes)
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![16](/assets/biome/16.png)|![16](/assets/biome/16.png)|![16](/assets/biome/16.png)|![16](/assets/biome/16.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![16](/assets/biome/16.png)|![0](/assets/biome/0.png)|![10](/assets/biome/10.png)|![10](/assets/biome/10.png)|![10](/assets/biome/10.png)|
|![16](/assets/biome/16.png)|![16](/assets/biome/16.png)|![16](/assets/biome/16.png)|![16](/assets/biome/16.png)|![0](/assets/biome/0.png)|![15](/assets/biome/15.png)|![15](/assets/biome/15.png)|![15](/assets/biome/15.png)|
|![15](/assets/biome/15.png)|![15](/assets/biome/15.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![15](/assets/biome/15.png)|![14](/assets/biome/14.png)|![14](/assets/biome/14.png)|![14](/assets/biome/14.png)|
|![14](/assets/biome/14.png)|![14](/assets/biome/14.png)|![15](/assets/biome/15.png)|![0](/assets/biome/0.png)|![15](/assets/biome/15.png)|![14](/assets/biome/14.png)|![14](/assets/biome/14.png)|![14](/assets/biome/14.png)|

### Input (River)
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|
|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|
|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|

### Output
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![7](/assets/biome/7.png)|![11](/assets/biome/11.png)|![11](/assets/biome/11.png)|![12](/assets/biome/12.png)|![12](/assets/biome/12.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![11](/assets/biome/11.png)|![11](/assets/biome/11.png)|![11](/assets/biome/11.png)|![12](/assets/biome/12.png)|
|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![1](/assets/biome/1.png)|![16](/assets/biome/16.png)|![16](/assets/biome/16.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|
|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![1](/assets/biome/1.png)|![16](/assets/biome/16.png)|![0](/assets/biome/0.png)|![10](/assets/biome/10.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|
|![16](/assets/biome/16.png)|![16](/assets/biome/16.png)|![16](/assets/biome/16.png)|![16](/assets/biome/16.png)|![0](/assets/biome/0.png)|![15](/assets/biome/15.png)|![15](/assets/biome/15.png)|![15](/assets/biome/15.png)|
|![15](/assets/biome/15.png)|![15](/assets/biome/15.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![15](/assets/biome/15.png)|![15](/assets/biome/15.png)|![15](/assets/biome/15.png)|![15](/assets/biome/15.png)|
|![14](/assets/biome/14.png)|![14](/assets/biome/14.png)|![15](/assets/biome/15.png)|![0](/assets/biome/0.png)|![15](/assets/biome/15.png)|![15](/assets/biome/15.png)|![15](/assets/biome/15.png)|![15](/assets/biome/15.png)|
