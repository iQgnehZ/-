package src.main;

public class Coproprietaire {
    private String nom;
    private String prenom;
    private String domicile;
    private int nbVoix;
	
    public Coproprietaire(String nom, String prenom, String domicile, int nbVoix) {
		this.nom = nom;
		this.prenom = prenom;
		this.domicile = domicile;
		this.nbVoix = nbVoix;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDomicile() {
		return domicile;
	}

	public void setDomicile(String domicile) {
		this.domicile = domicile;
	}

	public int getNbVoix() {
		return nbVoix;
	}

	public void setNbVoix(int nbVoix) {
		this.nbVoix = nbVoix;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((domicile == null) ? 0 : domicile.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
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
		Coproprietaire other = (Coproprietaire) obj;
		if (domicile == null) {
			if (other.domicile != null)
				return false;
		} else if (!domicile.equals(other.domicile))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}
    
    
    
}
