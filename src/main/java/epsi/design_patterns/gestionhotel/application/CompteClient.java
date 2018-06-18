package epsi.design_patterns.gestionhotel.application;

import epsi.design_patterns.gestionhotel.domain.Client;

public interface CompteClient {

	public Client createCompte(String nomCli,String prenomCli,String adresseCli,
								int noTelCli,String loginCli,String passwordCli);
	public void updateCompte(Client client, String nomCli,String prenomCli,String adresseCli,
			int noTelCli,String loginCli,String passwordCli);
	public void deleteCompte(int idCli);
	
	
}
