package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz.api.Logger;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz.api.RepozytoriumUżytkowników;
import org.springframework.context.ApplicationContext;

/**
 * WAŻNE: W celu uzyskania instrukcji umieść kursor na d_zainicjalizuj_i_zniszcz (pierwsza linijka tego pliku) wyświetl JavaDoc pakietu (w IntelliJu Ctrl+q).
 *
 * @author Kacper Staszek
 */
class Main {

  public static void main(String[] args) {
    ApplicationContext contextXML = null;

    Logger loggerXML = null;

    ApplicationContext contextJava = null;

    RepozytoriumUżytkowników repozytorium = null;

    Logger nazwanyLogger = null;

    Logger licznikLogger = null;

    repozytorium.setLogger(loggerXML);

    repozytorium.zapisz(new Użytkownik("Kacper"));

    repozytorium.setLogger(nazwanyLogger);

    repozytorium.zapisz(new Użytkownik("Znowu Kacper"));

    repozytorium.setLogger(licznikLogger);

    repozytorium.zapisz(new Użytkownik("Bez niespodzianek - Kacper"));
  }
}
