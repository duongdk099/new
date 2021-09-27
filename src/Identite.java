public class Identite {

	/**
	 * Attributs
	 */
	private String nip; // numero d'identification personnel
	private String nom;
	private String prenom;

	public  Identite(String n, String no, String pre) {
		this.nip = n ;
		this.nom = no ;
		this.prenom = pre ;
	}
	public String getNip() {
		return nip;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nip == null) ? 0 : nip.hashCode());
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
		Identite other = (Identite) obj;
		if (nip == null) {
			if (other.nip != null)
				return false;
		} else if (!nip.equals(other.nip))
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
