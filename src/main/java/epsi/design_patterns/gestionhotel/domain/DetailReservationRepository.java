package epsi.design_patterns.gestionhotel.domain;

import org.springframework.data.repository.CrudRepository;

public interface DetailReservationRepository extends CrudRepository<DetailReservation, Integer> {
	
	public DetailReservation findByQuantite(int quantite);
	public DetailReservation findByLibelle(String libelle);
	
}
