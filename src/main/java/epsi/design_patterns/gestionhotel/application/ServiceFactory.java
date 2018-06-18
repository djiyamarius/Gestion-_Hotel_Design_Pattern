package epsi.design_patterns.gestionhotel.application;

import epsi.design_patterns.gestionhotel.domain.Service;

public class ServiceFactory implements ServiceInterface {


	@Override
	public Service createService(String nomServ, String descriptif, double prixServ) {
		// TODO Auto-generated method stub
		Service service = new Service();
		service.setNomServ(nomServ);
		service.setDescriptif(descriptif);
		service.setPrixServ(prixServ);
		return service;
	}

	@Override
	public void updateService(Service serv, String nomServ, String descriptif, double prixServ) {
		// TODO Auto-generated method stub
		serv.setNomServ(nomServ);
		serv.setDescriptif(descriptif);
		serv.setPrixServ(prixServ);
		
	}

	@Override
	public void deleteService(int idServ) {
		// TODO Auto-generated method stub
		
	}


}
