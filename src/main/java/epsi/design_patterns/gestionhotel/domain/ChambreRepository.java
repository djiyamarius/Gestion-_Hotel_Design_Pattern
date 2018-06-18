package epsi.design_patterns.gestionhotel.domain;

import org.springframework.data.repository.CrudRepository;

public interface ChambreRepository extends CrudRepository<Chambre, Integer>{
	
	public Chambre findByPrix(double prix);
	public Chambre findByStatut(String statut);
	public Chambre findByType(String type);

}
