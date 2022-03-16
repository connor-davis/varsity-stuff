# ASCII Video
Created: 2022-02-23 19:13

This is a project Ill be learning alongside a youtube video.

![[Smiley Image.png]]

- All pixels in an image have RGB values.
- The average of the RGB values in the pixels --> brightness value

So this means out of Ñ@#W$9876543210?!abc;:+=-,._ 
- If bright we use Ñ
- If dark we use _

```js
// We will use this loop to identify the pixel color values (R,G,B)

for (let x = 0; x < spongebob.width; x++) {
	 for (let y = 0; y < spongebob.height; y++) {
		 let pixelIndex = (x + y * spongebob.width) * 4;
		 let r = spongebob.pixels(pixelIndex + 0);
		 let g = spongebob.pixels(pixelIndex + 1);
		 let b = spongebob.pixels(pixelIndex + 2);
	 }
}
```

So in a 5x5 pixel grid array, we have 25 pixels. This means that each pixel has 4 corresponding color values, R,G,B,A. I wont be paying attention to the alpha value for now.



|  0  |  1  |  2  |  3  |  4  |  5  |
|-----|-----|-----|-----|-----|-----|
|  1  |  0  |  1  |  2  |  3  |  4  |
|  2  |  5  |  6  |  7  |  8  |  9  |
|  3  |  10  |  11  |  12  |  13  |  14  |
|  4  |  15  |  16  |  17  |  18  |  19  |
|  5  |  20  |  21  |  22  |  23  |  24  |



## References
1. https://youtu.be/55iwMYv8tGI