package epsi.design_patterns.gestionhotel.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class DetailReservation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	private int quantite;
	private String libelle;
	
	
	/**
	 * Implémentations des classes d'associations
	 */
	@OneToMany(mappedBy="detReserv", cascade = CascadeType.ALL)
	Collection<Reservation> reservation = new ArrayList<Reservation>();
	
	@OneToMany(mappedBy="detailReserv", cascade = CascadeType.ALL)
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

	@Override
	public String toString() {
		return "DetailReservation [id=" + id + ", quantite=" + quantite + ", libelle=" + libelle + ", reservation="
				+ reservation + ", chambre=" + chambre + "]";
	}
	
	
	
}
