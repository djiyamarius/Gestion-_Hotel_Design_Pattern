package epsi.design_patterns.gestionhotel.application;

import epsi.design_patterns.gestionhotel.domain.Client;
import epsi.design_patterns.gestionhotel.domain.ClientRepository;

public class ClientFactory implements CompteClient {
	
	ClientRepository clientRepository;	

	public ClientFactory() {
		super();
		this.clientRepository = clientRepository;
		
	}

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
	public void updateCompte(Client client, String nomCli,String prenomCli,String adresseCli,
			int noTelCli,String loginCli,String passwordCli) {
		// TODO Auto-generated method stub
		
		client.setNomCli(nomCli);
		client.setPrenomCli(prenomCli);
		client.setAdresseCli(adresseCli);
		client.setNoTelCli(noTelCli);
		client.setLoginCli(loginCli);
		client.setPasswordCli(passwordCli);
		
	}

	@Override
	public void deleteCompte(int idCli) {
		// TODO Auto-generated method stub
		
	}

}
