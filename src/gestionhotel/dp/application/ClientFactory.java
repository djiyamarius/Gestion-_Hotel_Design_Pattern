package gestionhotel.dp.application;

import gestionhotel.dp.domain.Client;

public class ClientFactory implements CompteClient {

	@Override
	public Client createCompte(String nomCli, String prenomCli, String adresseCli, int noTelCli,
			String loginCli, String passwordCli) {
		// TODO Auto-generated method stub
		Client client = new Client();
		
		client.setNomCli(nomCli);
		client.setPrenomCli(prenomCli);
		client.setAdresseCli(adresseCli);
		client.setNoTelCli(noTelCli);
		client.setLoginCli(loginCli);
		client.setPasswordCli(passwordCli);
		
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
