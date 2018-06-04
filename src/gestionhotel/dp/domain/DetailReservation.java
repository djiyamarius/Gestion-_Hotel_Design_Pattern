package gestionhotel.dp.domain;

import java.util.ArrayList;
import java.util.Collection;

public class DetailReservation {
	
	private int quantite;
	private String libelle;
	
	Collection<Reservation> reservation = new ArrayList<Reservation>();
	Collection<Chambre> chambre = new ArrayList<Chambre>();
	
	public void addDetReservation(Chambre ch,Reservation reserv) {
		reservation.add(reserv);
		chambre.add(ch);		
	}
	
	public void removeDetReservation(Chambre ch,Reservation reserv) {
		reservation.remove(reserv);
		chambre.remove(ch);		
	}
	
	
	public Collection<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(Collection<Reservation> reservation) {
		this.reservation = reservation;
	}

	public Collection<Chambre> getPassagers() {
		return chambre;
	}

	public void setPassagers(Collection<Chambre> chambre) {
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
