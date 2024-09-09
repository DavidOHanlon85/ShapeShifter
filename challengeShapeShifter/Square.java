/**
 * 
 */
package challengeShapeShifter;

/**
 * This is the Square Class
 */
public class Square implements MyShape {

	private double length;// Constructors

	/**
	 * Constructor with no args
	 */
	public Square() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with args
	 * 
	 * @param length
	 */
	public Square(double length) {
		this.setLength(length);
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

	@Override
	public double calculatePerimeter() {
		return length * 4;
	}

	@Override
	public double calculateArea() {
		return Math.pow(length, 2);
	}

	@Override
	public String getShapeName() {
		return "Square";
	}

}
