package test;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import stl.Facet;
import stl.Point3D;
import stl.Solid;

class SolidTest {
	//Point3D points to be added
	Point3D pOne = new Point3D(21,30,45);
	Point3D pTwo = new Point3D(58,48,65);
	Point3D pThree = new Point3D(9,11,17);
	Point3D pFour = new Point3D(15,4,10);
	Point3D pFive = new Point3D(25,14,7);

	//Empty Solids
	Solid sOne = new Solid();
	Solid sTwo = new Solid();
	@Test
	void testInvalid() {

		//ensuring that a addfacet  with 0,1, and 2 parameters returns false
		assertFalse(sOne.addFacet());
		assertFalse(sOne.addFacet(pOne));
		assertFalse(sOne.addFacet(pOne,pTwo));

		//ensuring that the previous step adds the same facet to a solid
		assertEquals(sOne.toString(), sTwo.toString());
	}
	@Test
	void test3() {

		//ensuring that a solid addfacet  with 3 point3d parameters are correct
		Facet fOne = new Facet(pOne,pTwo,pThree); 	
				    
		sTwo.addFacet(fOne);			
		assertTrue(sOne .addFacet(pOne,pTwo,pThree));	

		//ensuring that the previous step adds the same two facets to a solid
		assertEquals(sOne.toString(), sTwo.toString());
	}
	
	@Test
	void test4() {			

		//Ensuring that an addfacet with 4 Point3D parameters returns true
		Facet fOne = new Facet(pOne,pTwo,pThree); 	
		Solid sTwo = new Solid();	
		Solid sThr = new Solid();			
		sTwo.addFacet(fOne);
		sTwo.addFacet(pOne,pThree,pFour);
		assertTrue(sThr.addFacet(pOne,pTwo,pThree,pFour));	
		//Ensuring the previous step adds the same two Facets to a solid
		assertEquals(sTwo.toString(), sThr.toString());
	}
	@Test
	void test5() {						

		Solid sFth = new Solid();				
		sOne.addFacet(pOne,pTwo,pThree);
		sOne.addFacet(pOne,pThree,pFour);
		sOne.addFacet(pOne,pFour,pFive);
				
		//Ensuring that an addfacet with 5 parameters returns true
		assertTrue(sFth.addFacet(pOne,pTwo,pThree,pFour,pFive));
		

		//Ensuring that the previous step adds 3 facets to a solid
		assertEquals(sOne.toString(), sFth.toString());
	}

}
