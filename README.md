<h1>Shape Shifter Challenge</h1>

<h2>Part 1</h2>

Create an interface IMyShape.java to represent a shape.  The interface should include the method signatures

double calculatePerimeter();

double calculateArea();

String getShapeName();

<h2>Part 2</h2>

Develop three classes, each of which implements the IMyShape interface.  The classes should represent a circle, square and rectangle respectively.  Choose appropriate instance variables for each class and initialise these in the constructor of each.

<h2>Part 3</h2>

Create a class for an ad hoc test of the implementations. 

Write a method in this class to randomly generate ten shapes (a mixture of circles, squares and rectangles) and store them in an array or arraylist.

<h2>Part 4</h2>

Write a method  that displays the name, area and perimeter of each shape in the array / arraylist.

Remember we are programming to the interface so ... so the output loop will look something like this...

for (MyShape shape : myShape){

System.out.print(shape.getShapeName());
    
etc.

<h2>Part 5</h2>

In the same method output the details for each specific shape eg. output the circle radius, the square's side & the rectangle's breadth and height.
