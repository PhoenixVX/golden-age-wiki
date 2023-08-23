# GenLayerDownfallMix *(b1.8-1.1)*

`GenLayerDownfallMix` blends the smoothly zoomed downfall values with the current biome downfall values using linear interpolation with varying strengths over different zoom levels.

## Pseudocode
```lua
downfall = downfall + (floor(biome.downfall * 65536) - downfall) / (zoomLevel + 1)
```

## Example
World Seed: Glacier<br>
Seed: N/A<br>
X: 0<br>
Z: 0<br>
Zoom level: 0<br>

### Input
![](/assets/biome/downfall-smoothzoom.png)

### Output
![](/assets/biome/downfall-mixed.png)
