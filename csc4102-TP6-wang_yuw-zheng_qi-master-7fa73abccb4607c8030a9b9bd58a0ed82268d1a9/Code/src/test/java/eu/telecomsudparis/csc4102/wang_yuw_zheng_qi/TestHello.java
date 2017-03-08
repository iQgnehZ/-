package eu.telecomsudparis.csc4102.wang_yuw_zheng_qi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestHello {

	private Hello hello;
	
	@BeforeClass
	public static void set() {
		
	}
	@AfterClass
	public static void tear() {
		
	}

	@Before
	public void setUp() {
		hello = new Hello("Hello");
	}

	@After
	public void tearDown() {
		hello = null;
	}

	@Test
	public void toStringTest1() {
		Assert.assertEquals("Hello", hello.toString());
	}
}
