package stl;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Path;

/**
 * @author Ryan Arreola
 * @version     1.0 
 */
public class Solid {
	private String name;
	private ArrayList<Facet> facets=new ArrayList<Facet>();

	public Solid (String name) {
		this.name = name;
	}
	
	public Solid () {
	}

	public boolean addFacet(Point3D... vertex) {

        if (vertex.length < 3)
            return false;
        else
            for (int i = 1; i < vertex.length - 1; i++) {
                Facet t = new Facet(vertex[0], vertex[i], vertex[i + 1]);
                facets.add(t);
            }
        return true;
    }
	
    public boolean addFacet(Facet facet) {

        facets.add(facet);
        if (facets.get(facets.size() - 1) != null)
            return true;

        else
            return false;
    }

	public String toString() {
		String temp = new String();
		temp += "solid "+name+"\n";
		for(Facet s : facets) 
			temp += s;		
		temp += "endsolid "+name;
		return temp;				

	}

	public void toTextFile(Path path) throws IOException{ 
		ArrayList<String>text = new ArrayList<String>();
		text.add(toString()); 
		Files.write(path, text, Charset.forName("UTF-8"));
	}

}
