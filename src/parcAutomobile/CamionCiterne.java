package parcAutomobile;

public class CamionCiterne extends Camion {

	public CamionCiterne(String immatriculation) {
		super(immatriculation, 3, 10);
	}

	public String toString() {
		 return "CamionCiterne" + super.toString();
	 }

	@Override
	int calculerVitesseMaximale() {
		if (this.charge < 4) {
			return 120;

		}
		else {
			return 90 ;
		}
	}

}
