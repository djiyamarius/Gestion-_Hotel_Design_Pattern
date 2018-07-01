package epsi.design_patterns.gestionhotel.application;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import epsi.design_patterns.gestionhotel.domain.ReservationRepository;
import epsi.design_patterns.gestionhotel.domain.Reservation;

public class ReservationFactory implements Reserver {
	@Autowired
	ReservationRepository reservationRepository;	


	@Override
	public Reservation createReservation( Date dateDeb, Date dateFin,String statut) {
		// TODO Auto-generated method stub
		Reservation reservation = new Reservation();
		reservation.setDateDeb(dateDeb);
		reservation.setDateFin(dateFin);
		reservation.setStatut(statut);
		reservationRepository.save(reservation);

		
		return reservation;
	}


	@Override
	public Reservation updateReservation(Reservation reserv, Date dateDeb, Date dateFin, String statut) {
		// TODO Auto-generated method stub
		
		reserv.setDateDeb(dateDeb);
		reserv.setDateFin(dateFin);
		reserv.setStatut(statut);
		reservationRepository.save(reserv);
			
			
			return reserv;
		
	}


	@Override
	public void cancelReservation( Reservation reserv) {
		// TODO Auto-generated method stub
		
		reservationRepository.delete(reserv);
		
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
