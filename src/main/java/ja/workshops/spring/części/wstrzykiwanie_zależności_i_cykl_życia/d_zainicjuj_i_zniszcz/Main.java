package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjuj_i_zniszcz;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjuj_i_zniszcz.api.Logger;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjuj_i_zniszcz.api.RepozytoriumUżytkowników;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * WAŻNE: W celu uzyskania instrukcji umieść kursor na d_zainicjuj_i_zniszcz (pierwsza linijka tego pliku) wyświetl JavaDoc pakietu (w IntelliJu Ctrl+q).
 *
 * @implSpec Zmieniasz tylko kod metody main!
 * @author Kacper Staszek
 */
class Main {

    public static void main(String[] args) {
        //TODO: w tej klasie tylko tu coś zmieniasz
        AbstractApplicationContext kontekstXML = null;

        Logger loggerXML = null;

        AbstractApplicationContext kontekstJava = null;

        RepozytoriumUżytkowników repozytorium = null;
        Logger nazwanyLogger = null;
        Logger licznikLogger = null;

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
