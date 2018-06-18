package epsi.design_patterns.gestionhotel.domain;

import org.springframework.data.repository.CrudRepository;

public interface ServiceRepository extends CrudRepository<Service, Integer> {
	
	
	public Service findByNomServ(String nom);
	public Service findByDescriptif(String descriptif);
	public Service findByPrixServ(double prixServ);

}
