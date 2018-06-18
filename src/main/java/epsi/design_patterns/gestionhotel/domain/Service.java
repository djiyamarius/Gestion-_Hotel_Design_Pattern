package epsi.design_patterns.gestionhotel.domain;

public class Service {
	
	private int idServ;
	private String nomServ;
	private String descriptif;
	private double prixServ;
	
	/**
	 * Implémentations des classes d'associations
	 */
	DetailService detailServ;
	
	
	public DetailService getDetailServ() {
		return detailServ;
	}
	public void setDetailServ(DetailService detailServ) {
		this.detailServ = detailServ;
	}
	public int getIdServ() {
		return idServ;
	}
	public void setIdServ(int idServ) {
		this.idServ = idServ;
	}
	public String getNomServ() {
		return nomServ;
	}
	public void setNomServ(String nomServ) {
		this.nomServ = nomServ;
	}
	public String getDescriptif() {
		return descriptif;
	}
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	public double getPrixServ() {
		return prixServ;
	}
	public void setPrixServ(double prixServ) {
		this.prixServ = prixServ;
	}
	
	

}
