package parcAutomobile;

public abstract  class Vehicule {
	protected String immatriculation ;
	protected int poidsVide ;
	public Vehicule(String immatriculation ,int poidsVide){
		this.immatriculation=immatriculation;
		this.poidsVide=poidsVide;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public int getPoidsVide() {
		return poidsVide;
	}
	abstract  int calculerVitesseMaximale();
	 public String toString() {
	        return "Immatriculation: " + immatriculation  ;
	    }
}
