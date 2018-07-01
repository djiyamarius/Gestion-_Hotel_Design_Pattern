package epsi.design_patterns.gestionhotel.application;

import epsi.design_patterns.gestionhotel.domain.Chambre;

public interface ChambreInterface {
	
	public Chambre createChambre(double prix, String statut,String type);
	public void updateChambre(Chambre chambre, double prix, String statut,String type);
	public void deleteChambre(Chambre chambre);

}
