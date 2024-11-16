package parcAutomobile;


public class App {
	 public static void main(String[] args) {
	      System.out.println("-----------constructeur PetitBus-----------------------------");

		 PetitBus petitBus =new PetitBus("176TN123",20);
		 afficherPetitBus(petitBus);
	      System.out.println("-----------tester facturer de  PetitBus-----------------------------");
	      double prix =petitBus.facturer(1430);
	      System.out.println("le prix de facture de cette petitBus est :"+prix);

	      System.out.println("-----------constructeur CamionBâché-----------------------------");

		 CamionBache camionB = new CamionBache ("180TN1245");
		 afficherCamion(camionB);
	      System.out.println("-----------constructeur CamionCiterne-----------------------------");

		 CamionCiterne camionC = new CamionCiterne ("170TN13245");
		 afficherCamion(camionC);
   	     System.out.println("tester la methode charger pour les deux camions et calculer vitesseMax");
		 camionC.charger(3);
		 camionB.charger(6);
		 afficherCamion(camionC);
		 afficherCamion(camionB);
   	     System.out.println("tester la methode charger quand le poids a charger depasse charge max ");
		 camionC.charger(30);
		 afficherCamion(camionC);
   	     System.out.println("tester les methodes de classe convoillocation");
   	     System.out.println("tester les methodes de classe convoillocation d'une liste vide");
   	     ConvoiLocation c = new ConvoiLocation();
	      System.out.println("le cout total est :"+c.calculerCoutLocation(1430));
	      System.out.println("le vehicule le puls lent est :"+c.getVéhiculePlusLent());
	   	  System.out.println("ajout de deux  petitBus");
	   	  c.ajouterVehicule(petitBus);
		  PetitBus petitBus2 =new PetitBus("134TN123",10);
	   	  c.ajouterVehicule(petitBus2);
	   	afficherlesvehiculelouable(c);
	   	System.out.println("tester les methodes de classe convoillocation d'une liste non  vide");
	      System.out.println("le cout total est :"+c.calculerCoutLocation(1430));
	      System.out.println("le vehicule le puls lent est :"+c.getVéhiculePlusLent());

	      

		 




		 

	 
}
	 private static void afficherPetitBus(PetitBus petitBus) {
	        System.out.println("immatriculation : "+petitBus.getImmatriculation());
	        System.out.println("NbreDePlaces : "+petitBus.getNbreDePlaces());
	        System.out.println("Poids A vide : "+petitBus.getPoidsVide());
	        System.out.println("vitesse maximale de petit bus  : "+petitBus.calculerVitesseMaximale()+"km/h");

	        
	    }
	    private static void afficherCamion(Camion camion) {
	    	  System.out.println("immatriculation : "+camion.getImmatriculation());
		      System.out.println("Poids A vide : "+camion.getPoidsVide());
		      System.out.println("chargeMax : "+camion.getChargeMax());
		      System.out.println("charge  : "+camion.getCharge());
		        System.out.println("vitesse maximale   : "+camion.calculerVitesseMaximale()+"km/h");


	    }
	    private static void afficherlesvehiculelouable(ConvoiLocation c) {
	    	for (VehiculeLouable v :  c.getVehiculesLouables() ) {
		    	  v.toString();

	    	}
	    }
}
