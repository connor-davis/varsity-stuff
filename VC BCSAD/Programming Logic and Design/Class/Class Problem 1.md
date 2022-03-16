# Class Problem 1
Created: 2022-03-03 14:10

Question - "Allow the user to enter a value of one edge of a cube. The program calculates surface area of a one side of the cube, the surface area of the cube and its volume. The program should output the results."

```java
/*
 * So for a cube, the formulas for volume and surface area are V = s3, V = s 3, 
 * and S = 6s2 S = 6 s 2. A cube is 2.5 2.5 inches on each side. Find its 1. volume 
 * and 2. surface area.
 */
```

### Pseudo Code

```pseudocode
start
	input lengthOfEdgeOfCube

	set surfaceAreaOfOneSide = lengthOfEdgeOfCube * lengthOfEdgeOfCube
	set totalSurfaceArea = surfaceAreaOfOneSide * 6
	set volumeOfCube = lengthOfEdgeOfCube * lengthOfEdgeOfCube * lengthOfEdgeOfCube

	output "Surface Area of One Side of Cube: "
		   + surfaceAreaOfOneSide
		   + "\nTotal Surface Area of Cube: "
		   + totalSurfaceArea 
		   + "\nVolume of Cube: "
		   + volumeOfCube 
stop
```

### Flow Chart

![[Problem 1 Flow Chart.png]]

## References
1. Day 2 PRLD
2. [formulas of surface area and volume of a cube - Search (bing.com)](https://www.bing.com/search?q=formulas+of+surface+area+and+volume+of+a+cube&cvid=f8b3309241a54a41b2fdfc06e9d35f2e&aqs=edge..69i57j0l4.8145j0j1&pglt=129&FORM=ANNTA1&PC=U531)