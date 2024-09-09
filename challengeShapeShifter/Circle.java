/**
 * 
 */
package challengeShapeShifter;

/**
 * This is the Circle Class
 */
public class Circle implements MyShape {
	
	// Constants
	
	public static final double PI = Math.PI;
	
	// Instance Variable
	
	private double radius; 
	
	// Constructors
	
	/**
	 * Default constructor
	 */
	public Circle() {
		
	}
	
	/**
	 * Constructor with args
	 * 
	 * @param radius
	 */
	public Circle(double radius) {
		this.setRadius(radius);
	}
	
	// Getters and Setters

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculatePerimeter() {
		return PI * radius * 2;
	}

	@Override
	public double calculateArea() {
		return PI * Math.pow(radius, 2);
	}

	@Override
	public String getShapeName() {
		return "Circle";
	}

}
