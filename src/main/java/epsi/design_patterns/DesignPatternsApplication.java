package epsi.design_patterns;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import epsi.design_patterns.gestionhotel.domain.ChambreRepository;

@SpringBootApplication
public class DesignPatternsApplication {

	private static final Logger log = LoggerFactory.getLogger(DesignPatternsApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo1(ChambreRepository repository) {
		return (args) -> {
			
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
