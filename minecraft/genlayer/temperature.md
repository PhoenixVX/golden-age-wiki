# GenLayerTemperature *(b1.8-1.1)*

`GenLayerTemperature` copies the temperatures of biomes and puts them in a range between 0 and 65536.

## Pseudocode
```lua
temperature = floor(biome.temperature * 65536)
```

## Example
World Seed: Glacier<br>
Seed: N/A<br>
X: 0<br>
Z: 0<br>

### Input
|  |  |  |  |  |  |  |  |
|--|--|--|--|--|--|--|--|
|![2](/assets/biome/2.png)|![5](/assets/biome/5.png)|![3](/assets/biome/3.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|![0](/assets/biome/0.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![4](/assets/biome/4.png)|![5](/assets/biome/5.png)|![2](/assets/biome/2.png)|![5](/assets/biome/5.png)|![1](/assets/biome/1.png)|![4](/assets/biome/4.png)|
|![4](/assets/biome/4.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![4](/assets/biome/4.png)|![5](/assets/biome/5.png)|![4](/assets/biome/4.png)|![4](/assets/biome/4.png)|![5](/assets/biome/5.png)|
|![1](/assets/biome/1.png)|![4](/assets/biome/4.png)|![5](/assets/biome/5.png)|![6](/assets/biome/6.png)|![5](/assets/biome/5.png)|![4](/assets/biome/4.png)|![3](/assets/biome/3.png)|![6](/assets/biome/6.png)|
|![6](/assets/biome/6.png)|![5](/assets/biome/5.png)|![2](/assets/biome/2.png)|![6](/assets/biome/6.png)|![1](/assets/biome/1.png)|![4](/assets/biome/4.png)|![2](/assets/biome/2.png)|![1](/assets/biome/1.png)|
|![1](/assets/biome/1.png)|![2](/assets/biome/2.png)|![2](/assets/biome/2.png)|![5](/assets/biome/5.png)|![4](/assets/biome/4.png)|![4](/assets/biome/4.png)|![6](/assets/biome/6.png)|![6](/assets/biome/6.png)|
|![3](/assets/biome/3.png)|![5](/assets/biome/5.png)|![6](/assets/biome/6.png)|![5](/assets/biome/5.png)|![6](/assets/biome/6.png)|![3](/assets/biome/3.png)|![1](/assets/biome/1.png)|![5](/assets/biome/5.png)|
|![1](/assets/biome/1.png)|![1](/assets/biome/1.png)|![2](/assets/biome/2.png)|![4](/assets/biome/4.png)|![2](/assets/biome/2.png)|![6](/assets/biome/6.png)|![1](/assets/biome/1.png)|![6](/assets/biome/6.png)|

### Output
![](/assets/biome/temperature.png)
