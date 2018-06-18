package epsi.design_patterns.gestionhotel.domain;

import java.util.ArrayList;
import java.util.Collection;

public class Client {
	
	private int idCli;
	private String nomCli;
	private String prenomCli;
	private String adresseCli;
	private int noTelCli;
	private String loginCli;
	private String passwordCli;
	

	/**
	 * Implémentations des classes d'associations
	 */
	
	Collection<Reservation> reserv = new ArrayList<Reservation>();
	
	public Collection<Reservation> getReserv() {
		return reserv;
	}
	public void setReserv(Collection<Reservation> reserv) {
		this.reserv = reserv;
	}
	
	public void setIdCli(int idCli) {
		this.idCli = idCli;
	}
	public String getNomCli() {
		return nomCli;
	}
	public void setNomCli(String nomCli) {
		this.nomCli = nomCli;
	}
	public String getPrenomCli() {
		return prenomCli;
	}
	public void setPrenomCli(String prenomCli) {
		this.prenomCli = prenomCli;
	}
	public String getAdresseCli() {
		return adresseCli;
	}
	public void setAdresseCli(String adresseCli) {
		this.adresseCli = adresseCli;
	}
	public int getNoTelCli() {
		return noTelCli;
	}
	public void setNoTelCli(int noTelCli) {
		this.noTelCli = noTelCli;
	}
	public String getLoginCli() {
		return loginCli;
	}
	public void setLoginCli(String loginCli) {
		this.loginCli = loginCli;
	}
	public String getPasswordCli() {
		return passwordCli;
	}
	public void setPasswordCli(String passwordCli) {
		this.passwordCli = passwordCli;
	}
	public int getIdCli() {
		return idCli;
	}
	
	
	
	

}
