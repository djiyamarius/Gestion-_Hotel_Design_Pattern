package gestionhotel.dp.domain;

import java.util.ArrayList;
import java.util.Collection;

public class DetailReservation {
	
	private int quantite;
	private String libelle;
	
	
	/**
	 * Implémentations des classes d'association
	 */
	Collection<Reservation> reservation = new ArrayList<Reservation>();
	Collection<Chambre> chambre = new ArrayList<Chambre>();
	
	
	
	public Collection<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(Collection<Reservation> reservation) {
		this.reservation = reservation;
	}

	public Collection<Chambre> getChambre() {
		return chambre;
	}

	public void setChambre(Collection<Chambre> chambre) {
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
