package epsi.design_patterns.gestionhotel.application;

import org.springframework.beans.factory.annotation.Autowired;

import epsi.design_patterns.gestionhotel.domain.Client;
import epsi.design_patterns.gestionhotel.domain.ClientRepository;

public class ClientFactory implements CompteClient {
	@Autowired
	ClientRepository clientRepository;	


	@Override
	public Client createCompte(String nomCli, String prenomCli, String adresseCli, int noTelCli,
			String loginCli, String passwordCli) {
		// TODO Auto-generated method stub
		Client client = clientRepository.findByNomCli(nomCli);
		if (client == null)
		{
			 client = new Client();
			
			 client.setNomCli(nomCli);
			 client.setPrenomCli(prenomCli);
			 client.setAdresseCli(adresseCli);
			 client.setNoTelCli(noTelCli);
			 client.setLoginCli(loginCli);
			 client.setPasswordCli(passwordCli);
			 clientRepository.save(client);
		}
		else 
		{
			 System.out.println("Le Nom choisit existe déja ");
		}
		return client;
	}

	@Override
	public Client updateCompte(Client client, String nomCli,String prenomCli,String adresseCli,
			int noTelCli,String loginCli,String passwordCli) {
		
		 client = clientRepository.findByNomCli(nomCli);
		if (client == null)
		{
			 System.out.println("Ce client n'existe pas. ");
		}	
		else {
		
		client.setNomCli(nomCli);
		client.setPrenomCli(prenomCli);
		client.setAdresseCli(adresseCli);
		client.setNoTelCli(noTelCli);
		client.setLoginCli(loginCli);
		client.setPasswordCli(passwordCli);
		clientRepository.save(client);
		}
		
		return client;
	}

	@Override
	public void deleteCompte(Client client) {
		// TODO Auto-generated method stub
		
		clientRepository.delete(client);
		
	}

}
