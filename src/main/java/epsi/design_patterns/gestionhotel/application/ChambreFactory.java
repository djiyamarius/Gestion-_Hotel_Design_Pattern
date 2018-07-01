package epsi.design_patterns.gestionhotel.application;

import org.springframework.beans.factory.annotation.Autowired;

import epsi.design_patterns.gestionhotel.domain.Chambre;
import epsi.design_patterns.gestionhotel.domain.ChambreRepository;

public class ChambreFactory implements ChambreInterface {
	@Autowired
	ChambreRepository chambreRepository;

	@Override
	public Chambre createChambre(double prix, String statut,String type) {
		// TODO Auto-generated method stub
				
		
			Chambre ch = new Chambre();
			
		ch.setPrix(prix);
		ch.setStatut(statut);
		ch.setType(type);	
		chambreRepository.save(ch);
		return ch;
	}

	@Override
	public void updateChambre(Chambre chambre, double prix, String statut,String type) {
		// TODO Auto-generated method stub
		chambre.setPrix(prix);
		chambre.setStatut(statut);
		chambre.setType(type);
		chambreRepository.save(chambre);

		
	}

	@Override
	public void deleteChambre(Chambre chambre) {
		// TODO Auto-generated method stub
		
		chambreRepository.delete(chambre);
		
		
	}

}
