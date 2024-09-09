package challengeShapeShifter;

/**
 * This is the Rectangle class
 */
public class Rectangle implements MyShape {

	// Instance Variables

	private double length;
	private double breadth;

	// Constructors

	/**
	 * This is the default constructor
	 */
	public Rectangle() {
		// TODO Auto-generated constructor stub
	} 
	
	/**
	 * Constructor with args
	 * 
	 * @param length
	 * @param breadth
	 */
	public Rectangle(double length, double breadth) {
		this.setLength(length);
		this.setBreadth(breadth);
	}

	// Getters and Setters

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the breadth
	 */
	public double getBreadth() {
		return breadth;
	}

	/**
	 * @param breadth the breadth to set
	 */
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	// Methods

	@Override
	public double calculatePerimeter() {
		return (2 * length) + (2 * breadth);
	}

	@Override
	public double calculateArea() {
		return length * breadth;
	}

	@Override
	public String getShapeName() {
		return "Rectangle";
	}

}
