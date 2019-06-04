package autowire.exerciseTwo.config;

import autowire.exerciseTwo.domain.Klient;
import autowire.exerciseTwo.domain.Salon;
import autowire.exerciseTwo.domain.Samochód;
import autowire.exerciseTwo.service.WynajęcieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TODO: Mamy wypożyczalnię samochodów. Spraw by Marcin mógł wyporzyczyć Czarną Wołgę. Uzupełnij
 *  aplikacje wymaganymi adnotacjami. Aby klient mógł wypożyczyć samochód zaprzęgnięte do pracy muszą
 *  zostać Repozytoria odpowiedzialne za persystencję wymaganych danych. Dzieje się to poprzez
 *  wykorzystanie odpowiednich Serwisów. Jedyne co powinieneś dopisać to adnotacje. Pamiętaj, że
 *  istnieje kilka sposobów wstrzykiwania zależności. Zwróć też uwagę, że odradzane jest
 *  wstrzykiwanie zależności przez pola.
 *  https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-setter-injection
 *  https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/stereotype/package-summary.html#package.description
 *
 * @author Marcin Ogorzałek
 */
// tu niezbędne może być wykorzystanie parametru basePackages
class WynajmemSamochodówApp {

  public static void main(String[] args) {
    ApplicationContext context =
        new AnnotationConfigApplicationContext(WynajmemSamochodówApp.class);
    WynajęcieService wynajęcieService = context.getBean(WynajęcieService.class);
    wynajęcieService.wydajSamochód(context.getBean(Klient.class),
        context.getBean(Samochód.class), context.getBean(Salon.class));
  }
}
