package epsi.design_patterns.gestionhotel.domain;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

	
	public Reservation findByDateDeb(Date dateDeb);
	public Reservation findByDateFin(Date dateFin);
	public Reservation findByStatut(String statut);
	
}
