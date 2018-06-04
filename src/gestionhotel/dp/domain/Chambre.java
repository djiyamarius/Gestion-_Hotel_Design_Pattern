package gestionhotel.dp.domain;

public class Chambre {
	private int noCh;
	private Double prix;
	private String statut;
	
	DetailReservation detailres ;
	
	public DetailReservation getDetailres() {
		return detailres;
	}
	public void setDetailres(DetailReservation detailres) {
		this.detailres = detailres;
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
