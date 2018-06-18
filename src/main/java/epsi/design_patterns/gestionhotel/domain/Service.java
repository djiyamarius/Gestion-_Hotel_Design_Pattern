package epsi.design_patterns.gestionhotel.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Service {
	
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private int idServ;
	private String nomServ;
	private String descriptif;
	private double prixServ;
	
	/**
	 * Implémentations des classes d'associations
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	DetailService detailServ;
	
	
	
	/**
	 * Constructor
	 */
	public Service(String nomServ, String descriptif, double prixServ, DetailService detailServ) {
		super();
		this.nomServ = nomServ;
		this.descriptif = descriptif;
		this.prixServ = prixServ;
		this.detailServ = detailServ;
	}
	
	public Service() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
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

	@Override
	public String toString() {
		return "Service [idServ=" + idServ + ", nomServ=" + nomServ + ", descriptif=" + descriptif + ", prixServ="
				+ prixServ + ", detailServ=" + detailServ + "]";
	}
	
	

}
