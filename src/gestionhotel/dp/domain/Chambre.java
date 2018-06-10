package gestionhotel.dp.domain;

public class Chambre {
	private int noCh;
	private Double prix;
	private String statut;
	
	/**
	 * Implémentations des classes d'association
	 */
	DetailReservation detailReserv;
	
	
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
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	

}
