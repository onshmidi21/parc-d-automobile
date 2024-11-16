package parcAutomobile;

public class PetitBus extends Vehicule implements VehiculeLouable {
	private int nbreDePlaces;

	public PetitBus(String immatriculation, int nbreDePlaces) {
		super(immatriculation, 4);
		this.immatriculation=immatriculation;
		this.nbreDePlaces=nbreDePlaces;
		
	}
	public int getNbreDePlaces() {
		return nbreDePlaces;
	}
	public String toString() {
		 return "petitBus" + super.toString();
	 }

	@Override
	public int calculerVitesseMaximale() {
		return 150;
	}
	@Override
	public double facturer(int d) {
     double duree = (double) d / calculerVitesseMaximale();
    return  duree*200 ;
	}
	

	

}
