package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Klient;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Salon;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Samochód;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.serwisy.WynajęcieSerwis;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p><b>WAŻNE: Aby uzyskać instrukcję umieść kursor na c_wstrzykiwanie_przez_mutatory (sama góra tego pliku) wyświetl JavaDoc pakietu (w IntelliJu Ctrl+q).</b></p>
 *
 * @author Marcin Ogorzałek
 */
// tu niezbędne może być wykorzystanie parametru basePackages
class WynajemSamochodówApp {

    public static void main(String[] args) {
        ApplicationContext kontekst = new AnnotationConfigApplicationContext(WynajemSamochodówApp.class);
        WynajęcieSerwis wynajęcieSerwis = kontekst.getBean(WynajęcieSerwis.class);
        wynajęcieSerwis.wydajSamochód(kontekst.getBean(Klient.class), kontekst.getBean(Samochód.class), kontekst.getBean(Salon.class));
    }
}
