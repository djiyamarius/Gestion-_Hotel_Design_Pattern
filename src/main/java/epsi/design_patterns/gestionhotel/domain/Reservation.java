package epsi.design_patterns.gestionhotel.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int noReserv;
	private Date dateDeb;
	private Date dateFin;
	private String statut;
	

	/**
	 * Implémentations des classes d'associations
	 */
	@ManyToOne
	DetailService detServ;
	@ManyToOne
	Client client ;
	@ManyToOne
	DetailReservation detReserv;
	
	//Contructeur
	
	public Reservation( Date dateDeb, Date dateFin, String statut, DetailService detServ, Client client,
			DetailReservation detReserv) {
		super();
		this.dateDeb = dateDeb;
		this.dateFin = dateFin;
		this.statut = statut;
		this.detServ = detServ;
		this.client = client;
		this.detReserv = detReserv;
	}
	
	public Reservation() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public DetailService getDetServ() {
		return detServ;
	}
	public void setDetServ(DetailService detServ) {
		this.detServ = detServ;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	public DetailReservation getDetReserv() {
		return detReserv;
	}
	public void setDetReserv(DetailReservation detReserv) {
		this.detReserv = detReserv;
	}
	public int getNoReserv() {
		return noReserv;
	}
	public void setNoReserv(int noReserv) {
		this.noReserv = noReserv;
	}
	public Date getDateDeb() {
		return dateDeb;
	}
	public void setDateDeb(Date dateDeb) {
		this.dateDeb = dateDeb;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	

	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	

}
