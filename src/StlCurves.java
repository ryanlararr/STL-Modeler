import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import curves.ConeCurve;
import curves.HalfSphere;
import curves.HyperbolicParaboloid;
import curves.MonkeySaddle;
import stl.*;

public class StlCurves {

	public static void main(String[] arg)
	{
		
		Scanner input = new Scanner(System.in);
		int option;
		List<Solid> curves= new ArrayList<>(); //List to store curve solids
		
		//index0
		String coneCurve = "c:\\temp\\ConeCurve.stl";
		CreateStlCurve curve1 = new CreateStlCurve();
		ConeCurve c = new ConeCurve();
		curve1.createMatrix(c);
		Solid solid1 = curve1.createSolid(c.getName());
		curves.add(solid1);
		
		//index1
		String halfSphere = "c:\\temp\\HalfSphere.stl";
		CreateStlCurve curve2 = new CreateStlCurve();
		HalfSphere h = new HalfSphere(20);
		curve2.createMatrix(h);
		Solid solid2 = curve2.createSolid(h.getName());
		curves.add(solid2);
		
		//index2
		String monkeySaddle = "c:\\temp\\MonkeySaddle.stl";
		CreateStlCurve curve3 = new CreateStlCurve();
		MonkeySaddle m = new MonkeySaddle();
		curve3.createMatrix(m);
		Solid solid3 = curve3.createSolid(m.getName());
		curves.add(solid3);
		
		//index3
		String hyberbolicParaboloid = "c:\\temp\\HyperbolicParaboloid.stl";
		CreateStlCurve curve4 = new CreateStlCurve();
		HyperbolicParaboloid hp = new HyperbolicParaboloid();
		curve4.createMatrix(hp);
		Solid solid4 = curve4.createSolid(hp.getName());
		curves.add(solid4);
		
		System.out.println("1 ConeCurve\n2 HalfSphere\n3 MonkeySaddle\n4 Hyperbolic Paraboloid\nWhich curve number do you want? ");
		option = input.nextInt();
		int index = option-1; //option minus one is equal to the index number; index starts at 0
		
		switch (option) {
		case 1:  
			Path path0 = Paths.get(coneCurve);
			System.out.println("ConeCurve has been created");
			try {
				curves.get((index)).toTextFile(path0); 
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			Path path1 = Paths.get(halfSphere);
			System.out.println("HalfSphere has been created");
			try {
				curves.get((index)).toTextFile(path1); 
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case 3:
			Path path2 = Paths.get(monkeySaddle);
			System.out.println("MonkeySaddle has been created");
			try {
				curves.get((index)).toTextFile(path2); 
			} catch (IOException e) {
				e.printStackTrace();
			}
		    break;
		case 4:
			Path path3 = Paths.get(hyberbolicParaboloid);
			System.out.println("Hyperbolic Paraboloid has been created");
			try {
				curves.get((index)).toTextFile(path3); 
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;			
		default:
		    System.err.println("Invalid input");
		}		
	 input.close();
	}//end main

}//end class
