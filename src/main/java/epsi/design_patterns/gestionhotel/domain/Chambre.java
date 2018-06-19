package epsi.design_patterns.gestionhotel.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Chambre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int noCh;
	
	private double prix;
	private String statut;
	private String type;
	
	/**
	 * Implémentations des classes d'associations
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	DetailReservation detailReserv;
	
	
	/**
	 * Constructor
	 */
	public Chambre( double prix, String statut, String type) {
		super();
		this.prix = prix;
		this.statut = statut;
		this.type = type;
		
	}
	
	public Chambre() {
		// TODO Auto-generated constructor stub
		super();
	}
	public DetailReservation getDetailReserv() {
		return detailReserv;
	}
	public void setDetailReserv(DetailReservation detailReserv) {
		this.detailReserv = detailReserv;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	@Override
	public String toString() {
		return "Chambre [noCh=" + noCh + ", prix=" + prix + ", statut=" + statut + ", type=" + type + ", detailReserv="
				+ detailReserv + "]";
	}

}
