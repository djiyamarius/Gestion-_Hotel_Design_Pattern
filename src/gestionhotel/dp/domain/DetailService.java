package gestionhotel.dp.domain;

import java.util.ArrayList;
import java.util.Collection;

public class DetailService {
	
	private int quantite;
	private String libelle;
	
	/**
	 * Implémentations des classes d'associations
	 */
	Collection<Reservation> reservation = new ArrayList<Reservation>();
	Collection<Service> chambre = new ArrayList<Service>();
	
	
	public Collection<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(Collection<Reservation> reservation) {
		this.reservation = reservation;
	}

	public Collection<Service> getChambre() {
		return chambre;
	}

	public void setChambre(Collection<Service> chambre) {
		this.chambre = chambre;
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
