package epsi.design_patterns.gestionhotel.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class DetailService {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int quantite;
	private String libelle;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	Collection<Reservation> reservation = new ArrayList<Reservation>();
	Collection<Service> serv = new ArrayList<Service>();
	
	
	
	public Collection<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(Collection<Reservation> reservation) {
		this.reservation = reservation;
	}


	public Collection<Service> getServ() {
		return serv;
	}

	public void setServ(Collection<Service> serv) {
		this.serv = serv;
	}

	public int getQuantite() {
		return quantite;
	}
		
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	

}
