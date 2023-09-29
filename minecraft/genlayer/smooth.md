# GenLayerSmooth

`GenLayerSmooth` smooths out data. For each space, if the left and right neighbors are equal and so are the top and bottom neighbors, either the left or right space is picked with a 50/50 chance. Otherwise, the top neighbor is picked if both vertical neighbors are the same or the left neighbor is picked if both horizontal neighbors are the same. If no neighbors match, the space is left as it is.

## Pseudocode
```lua
neighbors = input.neighbors(x, z)
[left, right, top, bottom] = neighbors

if left == right and top == bottom {
    if randbool(2) {
        biome = left
    } else {
        biome = right
    }
} else {
    if (top == bottom) {
        biome = top
    } else if (left == right) {
        biome = left
    }
}
```

## Example
World Seed: Staggoland<br>
Seed: 1000<br>
X: 4<br>
Z: 2<br>

### Input
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|
|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|
|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![-1](/assets/biome/-1.png)|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|
|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![-1](/assets/biome/-1.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|![7](/assets/biome/7.png)|

### Output
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
