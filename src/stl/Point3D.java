package stl;


/**
 * @author Ryan Arreola
 * @version     1.0 
 */
public class Point3D {

	private double x;
    private double y;
    private double z;
    
    /**
     * @param x
     * @param y
     * @param z
     */
    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    };
    
    public Point3D(Point3D value) {
        x = value.x;
        y = value.y;
        z = value.z;
    }
    
    //returns x,y,z
    public String toString() {        
    	return (x + " " + y + " " + z);     
    };
    
    //Calculate normal
    /**
     * @param v1
     * @param v2
     * @param v3
     * @return normal 
     */
    public static Point3D calcNormal(Point3D v1, Point3D v2, Point3D v3 ) {
    	double a1 = v2.x - v1.x;
        double b1 = v2.y - v1.y;
        double c1 = v2.z - v1.z;
        double a2 = v3.x - v1.x;
        double b2 = v3.y - v1.y;
        double c2 = v3.z - v1.z;
        double a = b1*c2 - b2*c1;
        double b = a2*c1 - a1*c2;
        double c = a1*b2 - b1*a2;
       
        //point on unit vector and find the square root of the sum and divided each point by unit
        double u = Math.sqrt((Math.pow(a,2))+(Math.pow(b,2))+(Math.pow(c,2)));
        
        double A = a/u;
        double B = b/u;
        double C = c/u;
        
        Point3D normal = new Point3D(A,B,C);
        return normal;
    }

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}
}
