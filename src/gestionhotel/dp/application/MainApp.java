package gestionhotel.dp.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n********************WELCOME TO HOTEL MANAGER********************");
		SimpleDateFormat simpleDateFormat =new SimpleDateFormat("dd/mm/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer le numéro de l'opération que vous souhaitez effectuer : \n 1. Reservation        2. Chambre          3.Client         4.Service ");
		int choix = sc.nextInt();
		if (choix==1) {
			System.out.println("***************Système de Réservation*************\n");
			 
			Reserver reserver = new ReservationFactory();
			System.out.println("Entrez la date de début (dd/mm/yyyy) : ");
			 String date1 =sc.nextLine();
			 
			 System.out.println("Entrez la date de fin (dd/mm/yyyy) : ");
			 String date2= sc.nextLine();
			 
			 Date dateDeb, dateFin;
			try {
				dateDeb = simpleDateFormat.parse(date1);
				 dateFin = simpleDateFormat.parse(date2);

				 System.out.println(dateDeb);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 


			 
//			 System.out.println(date);

			 
		}else 
			
			if (choix==2) {
			
		}else
			if (choix==3) {
			
		}else
			if (choix==4) {
			
		}
		
	}

}
