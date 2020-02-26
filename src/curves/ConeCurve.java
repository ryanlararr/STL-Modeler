package curves;

/**
 * Creates a V like cone curve 
 * @author      Howard Rosenblum
 * @version     1.0              
 */
public class ConeCurve implements Curve{

	/**
	 * Return the minimum X value of this curve
	 * @return minimum X value
	 */
	public double getMinX() {
		return -10;
	}
	
	/**
	 * Return the minimum Y value of this curve
	 * @return minimum Y value
	 */
	public double getMinY() {
		return -10;
	}
	
	/**
	 * Return the maximum X value of this curve
	 * @return maximum X value
	 */
	public double getMaxX() {
		return 10;
	}
	
	/**
	 * Return the maximum Y value of this curve
	 * @return maximum Y value
	 */
	public double getMaxY() {
		return 10;
	} 
	
	/**
	 * Return the step size for the grid used to plot this grid.
	 * @return step size
	 */
	public double getStepSize() {
		return 1;
	}
	
	/**
	 * Create the Z value for |x|+|y|
	 * @param x the X value
	 * @param y the Y value
	 * @return The Z value
	 */
	public double getZ(double x, double y)
	{
		return Math.abs(x)+Math.abs(y)+0.5;
	}

	/**
	 * Name of curve (same as filename)
	 * @return Name of curve
	 */
	public String getName()
	{
		return "ConeCurve";
	}
}
