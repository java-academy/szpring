package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjuj_i_zniszcz;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjuj_i_zniszcz.api.Logger;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjuj_i_zniszcz.api.RepozytoriumUżytkowników;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * WAŻNE: W celu uzyskania instrukcji umieść kursor na d_zainicjuj_i_zniszcz (pierwsza linijka tego pliku) wyświetl JavaDoc pakietu (w IntelliJu Ctrl+q).
 *
 * @implSpec Zmieniasz tylko kod metody main!
 * @author Kacper Staszek
 */
@ComponentScan // no bez tego adnotacje NIE pójdą, co sobie myślałeś :-D
class Main {

    public static void main(String[] args) {
        //TODO: w tej klasie tylko tu coś zmieniasz
        AbstractApplicationContext kontekstXML = new ClassPathXmlApplicationContext("wstrzykiwanie_zależności_i_cykl_życia.xml");
        kontekstXML.registerShutdownHook();

        Logger loggerXML = kontekstXML.getBean("xmlowy", Logger.class);

        AbstractApplicationContext kontekstJava = new AnnotationConfigApplicationContext(AppConfiguration.class, Main.class);
        kontekstJava.registerShutdownHook();

        RepozytoriumUżytkowników repozytorium = kontekstJava.getBean(RepozytoriumUżytkowników.class);
        Logger nazwanyLogger = kontekstJava.getBean("super logger", Logger.class);
        Logger licznikLogger = kontekstJava.getBean("liczywpis", Logger.class);

        testy(loggerXML, repozytorium, nazwanyLogger, licznikLogger);
    }

    private static void testy(Logger loggerXML, RepozytoriumUżytkowników repozytorium, Logger nazwanyLogger, Logger licznikLogger) {
        repozytorium.setLogger(loggerXML);
        repozytorium.zapisz(new Użytkownik("Kacper"));

        repozytorium.setLogger(nazwanyLogger);
        repozytorium.zapisz(new Użytkownik("Znowu Kacper"));

        repozytorium.setLogger(licznikLogger);
        repozytorium.zapisz(new Użytkownik("Bez niespodzianek - Kacper"));
    }
}
