/**
 * 
 */
package challengeShapeShifter;

import java.util.Random;

/**
 * Test Driver for ShapeShifter
 */
public class TestDriver {

	public static final int NUMBER_OF_SHAPES = 10;

	public static void main(String[] args) {

		// Array to hold shapes of all three types

		MyShape myShapes[] = new MyShape[NUMBER_OF_SHAPES];

		generateShapeArray(myShapes);

		basicPrintOutUsingForLoop(myShapes);

		detailedPrintOutUsingEnchancedForLoop(myShapes);

	}

	/**
	 * Prints out all values related to the MyShape interface as well as Class specific details
	 * 
	 * @param myShapes
	 */
	public static void detailedPrintOutUsingEnchancedForLoop(MyShape[] myShapes) {
		// enhanced loop for printing to console

		int tempmethod2 = 1;

		for (MyShape shape : myShapes) {
			System.out.println("Shape      : " + tempmethod2);
			System.out.println("Shape Name : " + shape.getShapeName());
			System.out.printf("Shape Peri : %.2f cm\n", shape.calculatePerimeter());
			System.out.printf("Shape Area : %.2f cm^2\n", shape.calculateArea());
			if (shape instanceof Square) {
				Square temp1 = (Square) shape;
				System.out.printf("Length     : %.2f cm\n", temp1.getLength());
			} else if (shape instanceof Circle) {
				Circle temp2 = (Circle) shape;
				System.out.printf("Radius     : %.2f cm\n", temp2.getRadius());
			} else if (shape instanceof Rectangle) {
				Rectangle temp3 = (Rectangle) shape;
				System.out.printf("Length     : %.2f cm\n", temp3.getLength());
				System.out.printf("Breadth    : %.2f cm\n", temp3.getBreadth());
			} else {
				System.out.println("Unrecognised Shape");
			}
			System.out.println();
			tempmethod2++;
		}
	}

	/**
	 * Prints out shared details in MyShape interface to console
	 * 
	 * @param myShapes
	 */
	public static void basicPrintOutUsingForLoop(MyShape[] myShapes) {
		// for loop for printing to console

		int temp = 1;

		for (int i = 0; i < myShapes.length; i++) {
			System.out.println("Shape     : " + temp);
			System.out.println("Shape Name : " + myShapes[i].getShapeName());
			System.out.printf("Shape Peri : %.2f cm\n", myShapes[i].calculatePerimeter());
			System.out.printf("Shape Area : %.2f cm^2\n", myShapes[i].calculateArea());
			System.out.println();
			temp++;
		}
		System.out.println();
	}

	/**
	 * This method generate a random shape array of {@value TestDriver#NUMBER_OF_SHAPES} shapes
	 * 
	 * @param myShapes
	 */
	public static void generateShapeArray(MyShape[] myShapes) {
		// Create a random generator

		Random rand = new Random();

		// Randomly create the shapes and store in array

		for (int i = 0; i < myShapes.length; i++) {
			int temp = rand.nextInt(3);
			switch (temp) {
			case 0:
				myShapes[i] = new Circle(rand.nextDouble(0.1, 10));
				break;
			case 1:
				myShapes[i] = new Square(rand.nextDouble(0.1, 10));
				break;
			case 2:
				myShapes[i] = new Rectangle(rand.nextDouble(0.1, 10), rand.nextDouble(0.1, 10));
				break;
			}
		}
	}

}
