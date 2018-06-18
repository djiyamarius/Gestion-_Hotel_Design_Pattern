package epsi.design_patterns.gestionhotel.domain;

import org.springframework.data.repository.CrudRepository;

public interface DetailServiceRepository extends CrudRepository<DetailReservation, Integer> {
	
	
	public DetailService findByQuantite(int quantite);
	public DetailService findBylibelle(String libelle);


}
