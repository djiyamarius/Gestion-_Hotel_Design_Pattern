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
	@OneToMany(mappedBy="detServ", cascade = CascadeType.ALL)
	Collection<Reservation> reservation = new ArrayList<Reservation>();
	
	@OneToMany(mappedBy="detailServ", cascade = CascadeType.ALL)
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
