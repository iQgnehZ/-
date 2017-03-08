package src.test.testsdevalidation;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import eu.telecomsudparis.csc4102.util.OperationImpossible;
import src.main.AssembleeGeneral;

public class TestAjouterQuestionVotee {

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

		@Test(expected=OperationImpossible.class)
		public void testAjouterQuestionVotes1(){
			ag.ajouterQuestionVotee("nomO", "nomQ", false);
		}

		@Test(expected=OperationImpossible.class)
		public void testAjouterQuestionVotes2Jeu1 (){
			ag.ajouterQuestionVotee("", "nomQ", true);
		}
		
		@Test(expected=OperationImpossible.class)
		public void testAjouterQuestionVotes2Jeu2(){
			ag.ajouterQuestionVotee(null, "nomQ", true);
		}
		
		@Test(expected=OperationImpossible.class)
		public void testAjouterQuestionVotes3Jeu1(){
			ag.ajouterQuestionVotee("nomO", "", true);
		}
		
		@Test(expected=OperationImpossible.class)
		public void testAjouterQuestionVotes3Jeu3(){
			ag.ajouterQuestionVotee("nomO", null, true);
		}	
		
}
