package epsi.design_patterns.gestionhotel.application;

import java.util.Date;

import epsi.design_patterns.gestionhotel.domain.Reservation;

public interface Reserver {
	
	public Reservation createReservation( Date dateDeb,Date dateFin,String statut);
	public void updateReservation(Reservation reserv, Date dateDeb,Date dateFin,String statut);
	public void cancelReservation(int noReserv);
	public void addChambre(Reservation r, int noCH);
	public void addService(Reservation r, int idServ);

	

}
