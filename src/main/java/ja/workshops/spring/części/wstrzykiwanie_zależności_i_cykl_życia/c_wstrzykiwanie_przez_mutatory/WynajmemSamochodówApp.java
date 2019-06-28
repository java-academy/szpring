package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Klient;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Salon;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Samochód;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.serwis.WynajęcieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p><b>WAŻNE: Aby uzyskać instrukcję umieść kursor na c_wstrzykiwanie_przez_mutatory (sama góra tego pliku) wyświetl JavaDoc pakietu (w IntelliJu Ctrl+q).</b></p>
 *
 * @author Marcin Ogorzałek
 */
// tu niezbędne może być wykorzystanie parametru basePackages
class WynajmemSamochodówApp {

  public static void main(String[] args) {
    ApplicationContext kontekst =
        new AnnotationConfigApplicationContext(WynajmemSamochodówApp.class);
    WynajęcieService wynajęcieService = kontekst.getBean(WynajęcieService.class);
    wynajęcieService.wydajSamochód(kontekst.getBean(Klient.class),
        kontekst.getBean(Samochód.class), kontekst.getBean(Salon.class));
  }
}
