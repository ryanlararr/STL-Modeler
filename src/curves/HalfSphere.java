package curves;

/**
 * The curve z=sqrt(max(radius*radius-x*x-y*y,0.1)) from (-radius,-radius) to (radius,radius)
 * @author      Howard Rosenblum
 * @version     1.0              
 */
public class HalfSphere implements Curve {
	private final double RADIUS;
	private final double R_SQUARED;
	
	/**
	 * Initial constructor
	 * @param radius radius of created half sphere
	 */
	public HalfSphere(double radius)
	{
		RADIUS = radius;
		R_SQUARED = radius*radius;
	}

	/**
	 * Return the maximum X value of this curve
	 * @return maximum X value
	 */
	public double getMaxX() {
		return RADIUS;
	}

	/**
	 * Return the maximum X value of this curve
	 * @return maximum X value
	 */
	public double getMaxY() {
		return RADIUS;
	}

	/**
	 * Return the minimum X value of this curve
	 * @return minimum X value
	 */
	public double getMinX() {
		return -RADIUS;
	}

	/**
	 * Return the minimum Y value of this curve
	 * @return minimum Y value
	 */
	public double getMinY() {
		return -RADIUS;
	}

	/**
	 * Return the step size for the grid used to plot this grid.
	 * @return step size
	 */
	public double getStepSize() {
		return RADIUS/50;
	}

	/**
	 * Create the Z value for Half Sphere
	 * @param x the X value
	 * @param y the Y value
	 * @return The Z value
	 */
	public double getZ(double x, double y) {
		return Math.sqrt(Math.max(R_SQUARED-x*x-y*y,0.1));
	}

	/**
	 * Name of curve (same as filename)
	 * @return Name of curve
	 */
	public String getName() {
		return "HalfSphere"+RADIUS;
	}
}
