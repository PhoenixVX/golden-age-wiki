# GenLayerAddIsland *(b1.8-1.1: GenLayerIsland)*

`GenLayerAddIsland` adds and removes land from existing islands. In spaces of land with all of its diagonal neighbors being oceans, it has a 1 in 5 chance of becoming ocean or a frozen ocean if it used to be an ice plains. In spaces of ocean with a diagonally neighboring piece of land, it has a 1 in 3 chance of becoming land and a chance of copying ice plains from a neighbor.

`GenLayerAddIsland` behaves differently in [Beta 1.8](/minecraft/genlayer/addisland-b18.md).

## Pseudocode
```lua
neighbors = input.diagonalNeighbors(x, z)

if biome != Biome.OCEAN or neighbors.allEqual(Biome.OCEAN) {
    if biome != Biome.OCEAN and Biome.OCEAN in neigbors {
        if randbool(5) {
            if biome == Biome.ICE_PLAINS {
                biome = Biome.FROZEN_OCEAN
            } else {
                biome = Biome.OCEAN
            }
        }
    }
} else {
    landNeighbors = 0
    copyNeighbor = Biome.PLAINS

    for neighbor in neighbors {
        if neighbor != Biome.OCEAN {
            landNeighbors += 1
            if randbool(landNeighbors) {
                copyNeighbor = neighbor
            }
        }
    }

    if randbool(3) {
        biome = copyNeighbor
    } else if copyNeighbor == Biome.ICE_PLAINS {
        biome = Biome.FROZEN_OCEAN
    } else {
        biome = 0
    }
}
```

## Example
World Seed: Glacier<br>
Seed: 1<br>
X: 0<br>
Z: 0<br>

### Input
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|

### Output
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|
