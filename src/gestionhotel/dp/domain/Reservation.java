package gestionhotel.dp.domain;

import java.util.Date;

public class Reservation {
	
	private int noReserv;
	private Date dateDeb;
	private Date dateFin;
	
	
	
	
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
