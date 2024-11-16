package parcAutomobile;

public class CamionBache extends Camion {

	public CamionBache(String immatriculation) {
		super(immatriculation, 4, 20);
	}
	 public String toString() {
		 return "CamionBâché" + super.toString();
	 }


	@Override
	int calculerVitesseMaximale() {
		if (this.charge < 3) {
			return 110;

		}
		else {
			return 80 ;
		}
	}
	
	

}
