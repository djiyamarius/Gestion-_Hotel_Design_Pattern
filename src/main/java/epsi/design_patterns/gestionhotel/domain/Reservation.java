package epsi.design_patterns.gestionhotel.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	DetailService detServ;
	Client client ;
	DetailReservation detReserv;
	
	
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
