<!-- TODO: What kind of demon is Notch summoning in the code of GenLayerVoronoiZoom? -->

# GenLayerVoronoiZoom *(b1.8-r1.1: GenLayerZoomVoronoi)*

`GenLayerVoronoiZoom` zooms in the map to quadruple scale to with voronoi interpolation.

## Pseudocode
```lua
-- *insert black magic here*
```

## Example
World Seed: madzgjicks<br>
Seed: 10<br>
X: 0<br>
Z: 0<br>

### Input
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|

### Output
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|
|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|
