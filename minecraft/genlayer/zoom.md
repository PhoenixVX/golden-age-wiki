# GenLayerZoom

`GenLayerZoom` doubles the size of the map with a scaling algorithm that picks neighboring biomes based on certain conditions. It is a smoother version of [`GenLayerFuzzyZoom`](/minecraft/genlayer/fuzzyzoom.md). Horizontally and vertically, the algorithm randomly picks between neighbors from the input map at half size. For diagonal interpolation, the algorithm uses a series of conditions to pick between four points in a quadrant then resorts to picking randomly if any of the conditions fail.

## Pseudocode
```lua
inputHalf = input.halfScale()

for x, y in inputHalf.quadrants() {
    ox = x * 2
    oz = z * 2
    output[ox, oz] = inputHalf[x, z]
    output[ox + 1, oz] = choose(inputHalf[x, z], inputHalf[x + 1, z])
    output[ox, oz + 1] = choose(inputHalf[x, z], inputHalf[x, z + 1])
    output[ox + 1, oz + 1] = choose(inputHalf[x, z], inputHalf[x + 1, z],
                                    inputHalf[x, z + 1], inputHalf[x + 1, z + 1])
}

function choose(m0, m1) {
    if randbool(2) {
        return m0
    } else {
        return m1
    }
}

function choose(m00, m01, m10, m11) {
    if m01 == m10 and m10 == m11 {
        return m01
    } else if m00 == m01 and m00 == m10
           or m00 == m01 and m00 == m11
           or m00 == m10 and m00 == m11
           or m00 == m01 and m10 != m11
           or m00 == m10 and m01 != m11
           or m00 == m11 and m01 != m10 {
        return m00
    } else if m01 == m00 and m10 != m11
           or m01 == m10 and m00 != m11
           or m01 == m11 and m00 != m10 {
        return m01
    } else if m10 == m00 and m01 != m11
           or m10 == m01 and m00 != m11
           or m10 == m11 and m00 != m01
           or m11 == m00 and m01 != m10
           or m11 == m01 and m00 != m10
           or m11 == m10 and m00 != m01 {
        return m10
    } else {
        options = [m00, m01, m10, m11]
        return randchoice(options)
    }
}
```

## Example
World Seed: Glacier<br>
Seed: 2001<br>
X: 0<br>
Z: 0<br>

### Input
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

### Output
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|
|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![0](/assets/biome/0.png)|![1](/assets/biome/1.png)|![0](/assets/biome/0.png)|
