package autowire.C_exerciseTwo.config;

import autowire.C_exerciseTwo.domain.Klient;
import autowire.C_exerciseTwo.domain.Salon;
import autowire.C_exerciseTwo.domain.Samochód;
import autowire.C_exerciseTwo.service.WynajęcieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Marcin Ogorzałek
 *
 * TODO: Mamy wypożyczalnię samochodów. Spraw by Marcin mógł wyporzyczyć Czarną Wołgę. Uzupełnij
 *  aplikacje wymaganymi adnotacjami. Aby klient mógł wypożyczyć samochód zaprzęgnięte do pracy muszą
 *  zostać Repozytoria odpowiedzialne za persystencję wymaganych danych. Dzieje się to poprzez
 *  wykorzystanie odpowiednich Serwisów. Jedyne co powinieneś dopisać to adnotacje. Pamiętaj, że
 *  istnieje kilka sposobów wstrzykiwania zależności. Zwróć też uwagę, że odradzane jest
 *  wstrzykiwanie zależności przez pola.
 *  https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-setter-injection
 *  https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/stereotype/package-summary.html#package.description
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
