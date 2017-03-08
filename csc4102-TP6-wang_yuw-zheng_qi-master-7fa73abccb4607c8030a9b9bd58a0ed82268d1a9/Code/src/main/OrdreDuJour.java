package src.main;
import java.util.*;

public class OrdreDuJour {
	private String nom;
	private HashSet<Question> questions; 
	
	public OrdreDuJour(String nom) {
		this.nom = nom;
		questions = new HashSet<Question>();
	}

	public void addQuestion(Question question){
    	questions.add(question);    	
    }

	public String getNom() {
		return this.nom;
	}


	public HashSet<Question> getQuestions() {
		return questions;
	}
	
	public boolean chercherQuestion(String intitule, boolean estVote){
		Question qcher = new Question(intitule, estVote);
		for(Question question : questions){
			if(question.equals(qcher)){
				return true;
			}
		}
		return false;
	}

}
