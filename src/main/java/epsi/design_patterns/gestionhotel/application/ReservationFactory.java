package epsi.design_patterns.gestionhotel.application;

import java.util.Date;

import epsi.design_patterns.gestionhotel.domain.Reservation;

public class ReservationFactory implements Reserver {

	@Override
	public Reservation createReservation( Date dateDeb, Date dateFin,String statut) {
		// TODO Auto-generated method stub
		Reservation reservation = new Reservation();
		reservation.setDateDeb(dateDeb);
		reservation.setDateFin(dateFin);
		reservation.setStatut(statut);
		
		return reservation;
	}


	@Override
	public void updateReservation(Reservation reserv, Date dateDeb, Date dateFin, String statut) {
		// TODO Auto-generated method stub
		reserv.setDateDeb(dateDeb);
		reserv.setDateFin(dateFin);
		reserv.setStatut(statut);
		
	}


	@Override
	public void cancelReservation(int noReserv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addChambre(Reservation r, int noCH) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addService(Reservation r, int idServ) {
		// TODO Auto-generated method stub
		
	}



}
