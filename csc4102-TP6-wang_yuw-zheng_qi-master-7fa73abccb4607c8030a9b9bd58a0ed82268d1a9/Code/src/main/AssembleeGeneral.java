package src.main;
import java.util.*;

public class AssembleeGeneral {
	private String nom;
	private Date date;
	private OrdreDuJour ordreDuJour;
	private ProcesVerbal procesVerbal;
	private HashSet<Coproprietaire> lesCoproprietaire; 

	
	public AssembleeGeneral (String nom, Date date) {
		this.nom = nom;
		this.date = date;
		ordreDuJour = new OrdreDuJour(nom);
	}
	
	public boolean invariant(){
		return nom != null && !nom.equals("") && date != null; 
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AssembleeGeneral other = (AssembleeGeneral) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	
	public boolean chercherCoproprietaire(String nomCop){
		for(Coproprietaire coproprietaire : lesCoproprietaire){
			if(coproprietaire.getNom().equals(nomCop)){
				return true;
			}
		}
		return false;	
	}
	
	public boolean chercherOrdreDuJour(String nomOrdreDuJour){
		if(ordreDuJour.getNom().equals(nomOrdreDuJour)){
				return true;
		
		}
		return false;	
	}
	
	public boolean ajouterQuestionVotee(String nomOrdreDuJour, String intitule, Boolean estVote){
	    if(this.chercherOrdreDuJour(nomOrdreDuJour)){
	    	if(!ordreDuJour.chercherQuestion(intitule, estVote)){
	    		Question q = new Question(intitule, estVote);
	    		ordreDuJour.addQuestion(q);
	    		return true;
	    	}
	    }   
	    return false; 
	}
}



