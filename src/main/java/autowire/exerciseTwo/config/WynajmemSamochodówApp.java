package autowire.exerciseTwo.config;

import autowire.exerciseTwo.domain.Klient;
import autowire.exerciseTwo.domain.Salon;
import autowire.exerciseTwo.domain.Samochód;
import autowire.exerciseTwo.service.WynajęcieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Marcin Ogorzałek
 */
@ComponentScan(basePackages = {"autowire.exerciseTwo"})
class WynajmemSamochodówApp {

  public static void main(String[] args) {
    ApplicationContext context =
        new AnnotationConfigApplicationContext(WynajmemSamochodówApp.class);
    WynajęcieService wynajęcieService = context.getBean(WynajęcieService.class);
    ;
    wynajęcieService.wydajSamochód(context.getBean(Klient.class),
        context.getBean(Samochód.class), context.getBean(Salon.class));
  }
}
