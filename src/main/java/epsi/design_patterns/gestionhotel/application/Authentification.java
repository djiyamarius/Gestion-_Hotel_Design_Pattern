package epsi.design_patterns.gestionhotel.application;

public interface Authentification {
	
	public void creerSession(String login, String pwd, String conf_pwd);
	public void ouvrirSession(String login, String pwd);
	
}
