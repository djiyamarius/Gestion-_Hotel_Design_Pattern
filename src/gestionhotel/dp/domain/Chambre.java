package gestionhotel.dp.domain;
public class Chambre {
	private int noCh;
	private double prix;
	private String statut;
	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * Implémentations des classes d'associations
	 */
	DetailReservation detailReserv;
	
	DetailReservation detailres ;
	
	public DetailReservation getDetailReserv() {
		return detailReserv;
	}
	public void setDetailReserv(DetailReservation detailReserv) {
		this.detailReserv = detailReserv;
	}
	public int getNoCh() {
		return noCh;
	}
	public void setNoCh(int noCh) {
		this.noCh = noCh;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	

}
