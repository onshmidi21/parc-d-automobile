package parcAutomobile;

public abstract class Camion extends Vehicule{
	protected int chargeMax;
	protected int charge=0;
    public Camion(String immatriculation, int poidsVide,int chargeMax) {
		super(immatriculation, poidsVide);
          	this.chargeMax=chargeMax;
          	}
    public int getChargeMax() {
    	return chargeMax;
    	
    }
    public int getCharge() {
    	return charge;
    	
    }
    

	void charger(int poids) {
		 if (this.charge + poids < this.chargeMax) {
		    	this.charge += poids;
		    	System.out.println("chargement avec poids="+poids);
		    }
		        else {
		    	System.out.println("charge maximale est depassée");

		           }		
	}
}
