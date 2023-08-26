# GenLayerSmoothZoom *(b1.8-r1.1)*

`GenLayerSmoothZoom` doubles the size of the map using bilinear interpolation with random points.

## Pseudocode
```lua
inputHalf = input.halfScale()

for x, y in inputHalf.quadrants() {
    ox = x * 2
    oz = z * 2
    output[ox, oz] = inputHalf[x, z]
    output[ox + 1, oz] = lerp(inputHalf[x, z], inputHalf[x + 1, z], randfloat())
    output[ox, oz + 1] = lerp(inputHalf[x, z], inputHalf[x, z + 1], randfloat())

    diaga = lerp(inputHalf[x, z], inputHalf[x + 1, z], randfloat())
    diagb = lerp(inputHalf[x, z + 1], inputHalf[x + 1, z + 1], randfloat())
    output[ox + 1, oz + 1] = lerp(diaga, diagb, randfloat())
}
```

## Example
World Seed: Glacier<br>
Seed: 1000<br>
X: 0<br>
Z: 0<br>

### Input
![](/assets/biome/temperature.png)

### Output
![](/assets/biome/temperature-smoothzoom.png)
