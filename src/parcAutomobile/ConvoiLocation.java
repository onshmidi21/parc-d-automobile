package parcAutomobile;

import java.util.ArrayList;
import java.util.List;

public class ConvoiLocation {
   private List<VehiculeLouable> vehiculesLouables;
   public ConvoiLocation () {
	    this.vehiculesLouables=new ArrayList <>();
         }
   public void ajouterVehicule(VehiculeLouable VehiculeLouable) {
	   vehiculesLouables.add(VehiculeLouable);
   }
   public List<VehiculeLouable> getVehiculesLouables() {
       return vehiculesLouables;
   }
   double calculerCoutLocation (int distance) {
	   double coutTotal=0;
	   for (VehiculeLouable vehiculeLouable :vehiculesLouables  ) {
		   coutTotal +=  vehiculeLouable.facturer(distance);
	   }
	   return coutTotal;
	
   }
   VehiculeLouable getVéhiculePlusLent () {
	   if (vehiculesLouables.isEmpty()) {
		   return null ;
		   
	   }
	   VehiculeLouable vehiculePlusLent = vehiculesLouables.get(0);
	   int vitesseMinimum=vehiculePlusLent.calculerVitesseMaximale();
	   for (VehiculeLouable v : vehiculesLouables) {
		   int vitesse=v.calculerVitesseMaximale();
		   if (vitesse<vitesseMinimum) {
			   vitesseMinimum=vitesse;
			   vehiculePlusLent=v;
		   }
	   }
	   return vehiculePlusLent ;
	   
	   
   }
}
