package epsi.design_patterns.gestionhotel.application;

import org.springframework.beans.factory.annotation.Autowired;

import epsi.design_patterns.gestionhotel.domain.ServiceRepository;
import epsi.design_patterns.gestionhotel.domain.Service;

public class ServiceFactory implements ServiceInterface {

	@Autowired
	ServiceRepository serviceRepository;	

	@Override
	public Service createService(String nomServ, String descriptif, double prixServ) {
		// TODO Auto-generated method stub
		Service service = serviceRepository.findByNomServ(nomServ);
		if (service == null)
		{
		 service = new Service();
		service.setNomServ(nomServ);
		service.setDescriptif(descriptif);
		service.setPrixServ(prixServ);
		serviceRepository.save(service);
		}
		else 
		{
			 System.out.println("Ce Service existe déja ");
		}
		return service;
	}

	@Override
	public Service updateService(Service serv, String nomServ, String descriptif, double prixServ) {
		// TODO Auto-generated method stub
		 serv = serviceRepository.findByNomServ(nomServ);
			if (serv == null)
			{
				 System.out.println("Ce client n'existe pas. ");
			}	
			else {
		serv.setNomServ(nomServ);
		serv.setDescriptif(descriptif);
		serv.setPrixServ(prixServ);
		
		serviceRepository.save(serv);
		
			}
		return serv;
	}

	@Override
	public void deleteService(Service service) {
		// TODO Auto-generated method stub
		
		serviceRepository.delete(service);
	}


}
