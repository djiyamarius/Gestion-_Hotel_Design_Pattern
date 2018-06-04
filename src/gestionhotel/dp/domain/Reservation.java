package gestionhotel.dp.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Reservation {
	
	private int noReserv;
	private Date dateDeb;
	private Date dateFin;
	
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
	
	

}
