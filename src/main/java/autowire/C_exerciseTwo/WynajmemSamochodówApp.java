package autowire.C_exerciseTwo;

import autowire.C_exerciseTwo.domain.Klient;
import autowire.C_exerciseTwo.domain.Salon;
import autowire.C_exerciseTwo.domain.Samochód;
import autowire.C_exerciseTwo.service.WynajęcieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p><b>WAŻNE: Aby uzyskać instrukcję umieść kursor na C_exerciseTwo (sama góra tego pliku) i wciśnij Ctrl+q</b></p>
 *
 * @author Marcin Ogorzałek
 */
// tu niezbędne może być wykorzystanie parametru basePackages
@ComponentScan(basePackages = {"autowire.C_exerciseTwo"})
class WynajmemSamochodówApp {

  public static void main(String[] args) {
    ApplicationContext context =
        new AnnotationConfigApplicationContext(WynajmemSamochodówApp.class);
    WynajęcieService wynajęcieService = context.getBean(WynajęcieService.class);
    wynajęcieService.wydajSamochód(context.getBean(Klient.class),
        context.getBean(Samochód.class), context.getBean(Salon.class));
  }
}
