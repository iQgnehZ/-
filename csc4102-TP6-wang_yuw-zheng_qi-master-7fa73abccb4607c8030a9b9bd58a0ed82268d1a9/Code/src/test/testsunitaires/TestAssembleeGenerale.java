
package src.test.testsunitaires;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import eu.telecomsudparis.csc4102.util.OperationImpossible;
import src.main.AssembleeGeneral;


public class TestAssembleeGenerale {
	
     AssembleeGeneral ag;


     
	@Before
	public void setUp() throws Exception{
		Date date = new Date();
		String name = "ag1";
		ag = new AssembleeGeneral(name, date);
	}

	@After
	public void tearDown() {
		ag = null;
	}
	
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructeur1Jeu1(){
		new AssembleeGeneral(null, new Date());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructeur1Jeu2(){
		new AssembleeGeneral("", new Date());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructeur2Jeu1(){
		new AssembleeGeneral("ag", null);
	}	
	
	@Test
	public  void testConstructeur3 (){ 
		Assert.assertTrue(ag.invariant ());  
	}
}
