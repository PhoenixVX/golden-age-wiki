# GenLayerTemperatureMix *(b1.8-r1.1)*

`GenLayerTemperatureMix` blends the smoothly zoomed temperature values with the current biome temperature values using linear interpolation with varying strengths over different zoom levels.

## Pseudocode
```lua
temperature = temperature + (floor(biome.temperature * 65536) - temperature) / (zoomLevel * 2 + 1)
```

## Example
World Seed: Glacier<br>
Seed: N/A<br>
X: 0<br>
Z: 0<br>
Zoom level: 0<br>

### Input
![](/assets/biome/temperature-smoothzoom.png)

### Output
![](/assets/biome/temperature-mixed.png)
