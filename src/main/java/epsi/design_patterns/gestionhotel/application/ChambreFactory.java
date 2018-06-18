package epsi.design_patterns.gestionhotel.application;

import epsi.design_patterns.gestionhotel.domain.Chambre;

public class ChambreFactory implements ChambreInterface {

	@Override
	public Chambre createChambre(double prix, String statut,String type) {
		// TODO Auto-generated method stub
		Chambre ch = new Chambre();
		
		ch.setPrix(prix);
		ch.setStatut(statut);
		ch.setType(type);
		
		return ch;
	}

	@Override
	public void updateChambre(Chambre chambre, double prix, String statut,String type) {
		// TODO Auto-generated method stub
		chambre.setPrix(prix);
		chambre.setStatut(statut);
		chambre.setType(type);
		
	}

	@Override
	public void deleteChambre(int noCh) {
		// TODO Auto-generated method stub
		
	}

}
