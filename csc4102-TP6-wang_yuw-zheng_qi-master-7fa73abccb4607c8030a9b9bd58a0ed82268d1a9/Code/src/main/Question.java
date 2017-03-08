package src.main;

public class Question {
	private int id;
	private String intitule;
	private boolean estVote;
	
	public Question(String intitule, boolean estVote) {
		this.id = id;
		this.intitule = intitule;
		this.estVote = estVote;
	}
	public int getId() {
		return id;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public boolean isEstVote() {
		return estVote;
	}
	public void setEstVote(boolean estVote) {
		this.estVote = estVote;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (estVote ? 1231 : 1237);
		result = prime * result + ((intitule == null) ? 0 : intitule.hashCode());
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
		Question other = (Question) obj;
		if (estVote != other.estVote)
			return false;
		if (intitule == null) {
			if (other.intitule != null)
				return false;
		} else if (!intitule.equals(other.intitule))
			return false;
		return true;
	}
	
}
