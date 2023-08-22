# GenLayerSwampRivers

`GenLayerSwampRivers` adds spots of rivers to swamplands and jungles. 1 in 6 swampland spaces *(1.2/12w01a+ and 1 in 8 jungle or jungle hills)* spaces are replaced

## Pseudocode
```lua
if biome == Biome.SWAMPLAND and randbool(6)
or (biome == Biome.JUNGLE or biome == Biome.JUNGLE_HILLS) and randbool(8) {
    biome = Biome.RIVER
}
```

## Example
World Seed: Glacier<br>
Seed: 1000<br>
X: 0<br>
Z: 0<br>

### Input
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|
|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|
|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|
|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|
|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|
|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|
|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|
|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|

### Output
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![7](/assets/biome/7.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![7](/assets/biome/7.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|
|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|
|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![7](/assets/biome/7.png)|
|![6](/assets/biome/6.png)|![7](/assets/biome/7.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|
|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![7](/assets/biome/7.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|
|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|
|![7](/assets/biome/7.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|
|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![21](/assets/biome/21.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|![22](/assets/biome/22.png)|
