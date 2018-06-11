package gestionhotel.dp.application;

import gestionhotel.dp.domain.Service;

public interface ServiceInterface {
	
	public Service createService(String nomServ, String descriptif, double prixServ);
	public void updateService(Service service, String nomServ, String descriptif, double prixServ);
	public void deleteService(int idServ);

}
