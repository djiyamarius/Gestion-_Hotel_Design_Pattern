package epsi.design_patterns.gestionhotel.domain;

import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer> {
	
	public Client findByNomCli(String nom);
	public Client findByPrenomCli(String prenom);
	public Client findByAdresseCli(String adresse);
	public Client findByNoTelCli(int noTel);
	public Client findByLoginCli(String login);
	public Client findByPasswordCli(String password);

}
