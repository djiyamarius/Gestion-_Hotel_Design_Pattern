package epsi.design_patterns.gestionhotel.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	
	@OneToMany(mappedBy="client", cascade = CascadeType.ALL)
	Collection<Reservation> reserv = new ArrayList<Reservation>();
	
	
	
	/**
	 *Contructor
	 */
	public Client( String nomCli, String prenomCli, String adresseCli, int noTelCli, String loginCli,
			String passwordCli, Collection<Reservation> reserv) {
		super();
		this.nomCli = nomCli;
		this.prenomCli = prenomCli;
		this.adresseCli = adresseCli;
		this.noTelCli = noTelCli;
		this.loginCli = loginCli;
		this.passwordCli = passwordCli;
		this.reserv = reserv;
	}
	
	public Client() {
		// TODO Auto-generated constructor stub
		super();
	}
	
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
