package epsi.design_patterns;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import epsi.design_patterns.gestionhotel.application.ClientFactory;
import epsi.design_patterns.gestionhotel.application.CompteClient;
import epsi.design_patterns.gestionhotel.application.ReservationFactory;
import epsi.design_patterns.gestionhotel.application.Reserver;
import epsi.design_patterns.gestionhotel.domain.Chambre;
import epsi.design_patterns.gestionhotel.domain.ChambreRepository;
import epsi.design_patterns.gestionhotel.domain.Client;
import epsi.design_patterns.gestionhotel.domain.ClientRepository;
import epsi.design_patterns.gestionhotel.domain.Service;
import epsi.design_patterns.gestionhotel.domain.ServiceRepository;

@SpringBootApplication
public class DesignPatternsApplication {

	private static final Logger log = LoggerFactory.getLogger(DesignPatternsApplication.class);
	
	@Autowired
	ClientRepository clientRepository;
	@Autowired
	ServiceRepository serviceRepository;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo1(ChambreRepository  repository) {
		return (args) -> {
			
			Client client = new Client("Clomegah", "Boris", "132 tombe", 06, "Easy1", "Easy001");
			//client.createCompte;
			clientRepository.save(client);
			
			/*clientRepository.findByLoginCli("Easy1")
			.ifPresent(voit -> {
				log.info("Voiture found with findById(11AA22):");
				log.info("--------------------------------");
				log.info(voit.toString());
				log.info("");
			});*/
			
			Chambre chambre1 = new Chambre(22, "libre", "suite");
			repository.save(chambre1);
			Chambre chambre2 = new Chambre(22, "libre", "double");
			repository.save(chambre2);
			Chambre chambre3 = new Chambre(22, "libre", "suite");
			repository.save(chambre3);
			Chambre chambre4 = new Chambre(22, "occupé", "simple");
			repository.save(chambre4);
			Chambre chambre5 = new Chambre(22, "occupé", "suite");
			repository.save(chambre5);
			
			Service service1 = new Service("dejeuner", "votre dejeuner vous est servie en chambre", 20);
			serviceRepository.save(service1);
			Service service2 = new Service("diner", "votre diner vous est servie en chambre", 35);
			serviceRepository.save(service2);
			Service service3 = new Service("ménage", "le ménage sera fait dans votre chambre", 5);
			serviceRepository.save(service3);
			Service service4 = new Service("petit-dejeuner", "votre petit-dejeuner vous est servie en chambre", 15);
			serviceRepository.save(service4);
			
			System.out.println("\n********************WELCOME TO HOTEL MANAGER********************");
			SimpleDateFormat simpleDateFormat =new SimpleDateFormat("dd/mm/yyyy");
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez entrer le numéro de l'opération que vous souhaitez effectuer : \n 1. Client        2. Chambre          3.Réservation         4.Service ");
			int choix = sc.nextInt();
			
			
			
			//Client
			if (choix==1) {
				System.out.println("***************Système de Client*************\n");
				 
				//CompteClient client2 = new ClientFactory();
				//Scanner sc1 = new Scanner(System.in);
				System.out.println("Etes vous déja Client : 1(oui)/2(non)");
				int choix1 = sc.nextInt();
					if(choix1==1)
					{
						System.out.println("Entrez votre Login : ");
						String rep0 = sc.next();
						Client client1 = clientRepository.findByLoginCli(rep0);
						if(client1==null)
						{
							System.out.println("Le login est incorrect");
						}
						else 
						{
							System.out.println("Entrez votre Passeword : ");
							String rep7 = sc.next();
							client1 = clientRepository.findByPasswordCli(rep7);
							if(client1==null)
							{
								System.out.println("Le Passeword est incorrect");
							}
							else
							{
								System.out.println("Vous êtes bien enregistré dans la base de donnée ");
							}
						}
					}
					else if(choix1==2)
					{ 
						
						
						System.out.println("Entrez votre Nom : ");
						String rep1 = sc.next();
						System.out.println("Entrez votre Prenom : ");
						String rep2 = sc.next();
						System.out.println("Entrez votre Adresse : ");
						String rep3 = sc.next();
						System.out.println("Entrez votre numéro de téléphone : ");
						int rep4 = sc.nextInt();
						System.out.println("Entrez votre Login : ");
						String rep5 = sc.next();
						System.out.println("Entrez votre Passeword : ");
						String rep6 = sc.next();
						
						Client client3 = new Client(rep1, rep2, rep3, rep4, rep5, rep6);
						clientRepository.save(client3);
						
						System.out.println(client3.toString());
					}

				 
//				 System.out.println(date);    
					
				 
			}else 
				
				//Chambre
				
				if (choix==2) {
					System.out.println("***************Système de Chambre*************\n");
					
					System.out.println("Veuillez entrer le numéro de l'opération que vous souhaitez effectuer : \n 1. afficher  toutes les chambres        2.afficher les chambres libre" );
					int choix3 = sc.nextInt();
					if(choix3==1)
					{	for(Chambre chambre0 :  repository.findAll())
						{
						System.out.println(chambre0.getNoCh()+" "+chambre0.getPrix()+ " "+chambre0.getStatut()+" "+chambre0.getType());
						}
					}
					else if (choix3==2)
					{
						repository.findById(2)
						.ifPresent(voit -> {
							log.info("Voiture found with findById(2):");
							log.info("--------------------------------");
							log.info(voit.toString());
							log.info("");
						});
						
//						String statut = "libre";
//						for(Chambre chambre8 :  repository.count())
//						{
//							System.out.println(chambre8.getPrix()+ " "+chambre8.getStatut()+" "+chambre8.getType());
//						}
					}
					 
					
					/*ChambreInterface chambre = new ChambreFactory();
					System.out.println("Entrez le prix de la chambre");
					double prix = sc.nextDouble();
					System.out.println("Entrez le Type de Chambre Simple, Double ou Suite :");
					String type= sc.next();
					String statut ="libre";				
					chambre.createChambre(prix, statut, type);
					System.out.println(" Vous avez crée une chambre :\n Prix : "+ prix +"€\n Status : "+statut+"\n Type : "+type);*/
					
					

			}else
				
				//Réservation
				if (choix==3) {
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
				
			}else
				
				//Service
				
				if (choix==4) {
				
			}
			
			//Conduire c = new ConduireTaxi();
			//c.addPassager("tintin");
			
//			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//			Date miseEnCirculation = df.parse("30/05/2018");
//			
//			Voiture voiture = new Voiture(miseEnCirculation, "11AA22");
//			
//			Passager passager = new Passager("Tintin", 50);
//			voiture.addPassager(passager);
//			
//			repository.save(voiture);
//			
//			repository.findById("11AA22")
//			.ifPresent(voit -> {
//				log.info("Voiture found with findById(11AA22):");
//				log.info("--------------------------------");
//				log.info(voit.toString());
//				log.info("");
//			});
		};
	}
	
	

}
