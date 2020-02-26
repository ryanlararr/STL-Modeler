package stl;
/**
 * @author Ryan Arreola
 * @version     1.0 
 */

public class Facet {

	private Point3D normal = new Point3D(0, 0, 0);
	private Point3D vi;
	private Point3D vii;
	private Point3D viii;

	public Facet(Point3D v1, Point3D v2, Point3D v3) {

		this.vi = v1;
		this.vii = v2;
		this.viii = v3;
		this.normal = Point3D.calcNormal(vi, vii, viii);

	}

	public String toString() {

		return "\nfacet normal " +
				normal + "\n" + " outer loop \n "+
				" vertex " + vi + "\n  vertex " + vii +
				"\n  vertex "+ viii + "\n endloop"
				+ "\nendfacet";

	}

}
