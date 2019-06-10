package autowire.D_init_and_destroy;

import autowire.D_init_and_destroy.api.Logger;
import autowire.D_init_and_destroy.api.RepozytoriumUżytkowników;
import org.springframework.context.ApplicationContext;

/**
 * WAŻNE: W celu uzyskania instrukcji umieść kursor na D_init_and_destroy
 * (pierwsza linijka tego pliku) i wciśnij ctrl+q
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
