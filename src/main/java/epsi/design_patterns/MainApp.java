package epsi.design_patterns;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import epsi.design_patterns.gestionhotel.application.ChambreFactory;
import epsi.design_patterns.gestionhotel.application.ChambreInterface;
import epsi.design_patterns.gestionhotel.application.ReservationFactory;
import epsi.design_patterns.gestionhotel.application.Reserver;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n********************WELCOME TO HOTEL MANAGER********************");
		SimpleDateFormat simpleDateFormat =new SimpleDateFormat("dd/mm/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer le numéro de l'opération que vous souhaitez effectuer : \n 1. Reservation        2. Chambre          3.Client         4.Service ");
		int choix = sc.nextInt();
		
		//Réservation
		if (choix==1) {
			System.out.println("***************Système de Réservation*************\n");
			 
			Reserver reserver = new ReservationFactory();
			System.out.println("Entrez la date de début (dd/mm/yyyy) : ");
			 String date1 =sc.next();
			 
			 System.out.println("Entrez la date de fin (dd/mm/yyyy) : ");
			 String date2= sc.next();
			 
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
			
			//Chambre
			
			if (choix==2) {
				System.out.println("***************Système de Chambre*************\n");
				
				 
				ChambreInterface chambre = new ChambreFactory();
				System.out.println("Entrez le prix de la chambre");
				double prix = sc.nextDouble();
				System.out.println("Entrez le Type de Chambre Simple, Double ou Suite :");
				String type= sc.next();
				String statut ="libre";				
				chambre.createChambre(prix, statut, type);
				System.out.println(" Vous avez crée une chambre :\n Prix : "+ prix +"€\n Status : "+statut+"\n Type : "+type);
				
				

		}else
			
			//Client
			if (choix==3) {
			
		}else
			
			//Service
			
			if (choix==4) {
			
		}
		
	}

}
