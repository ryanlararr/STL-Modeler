package curves;
/**
 * Interface for all 3D printable curves.
 * @author      Howard Rosenblum
 * @version     1.0              
 */
public interface Curve {
	
	/**
	 * Return the maximum X value of this curve
	 * @return maximum X value
	 */
	double getMaxX();
	
	/**
	 * Return the maximum Y value of this curve
	 * @return maximum Y value
	 */
	double getMaxY();
	
	/**
	 * Return the minimum X value of this curve
	 * @return minimum X value
	 */
	double getMinX();
	
	/**
	 * Return the minimum Y value of this curve
	 * @return minimum Y value
	 */
	double getMinY();
	
	/**
	 * Step size to be used 3D printing
	 * @return step size
	 */
	double getStepSize();
	
	
	/**
	 * Z value for given x/y coordinate
	 * @param x X value on curve
	 * @param y Y value on curve
	 * @return Z value on curve
	 */
	double getZ(double x, double y);	
	
	/**
	 * Name of curve (same as filename)
	 * @return Name of curve
	 */
	String getName();
}
