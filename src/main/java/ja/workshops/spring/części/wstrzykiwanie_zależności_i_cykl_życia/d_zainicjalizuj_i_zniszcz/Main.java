package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz.api.Logger;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz.api.RepozytoriumUżytkowników;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * WAŻNE: Umieść kursor na d_zainicjalizuj_i_zniszcz (pierwsza linia tego pliku)
 * i wciśnij Ctrl+q w celu zobaczenia instrukcji.
 *
 * @author Kacper Staszek
 */
@ComponentScan(basePackages = "ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz")
class Main {

  public static void main(String[] args) {
    AbstractApplicationContext contextXML =
        new ClassPathXmlApplicationContext("konfiguracja.xml");
    contextXML.registerShutdownHook();

    Logger loggerXML = contextXML.getBean("logger", Logger.class);

    AbstractApplicationContext contextJava =
        new AnnotationConfigApplicationContext(AppConfiguration.class, Main.class);
    contextJava.registerShutdownHook();

    RepozytoriumUżytkowników repozytorium = contextJava.getBean(RepozytoriumUżytkowników.class);

    Logger nazwanyLogger = contextJava.getBean("getNazwanyLogger", Logger.class);

    Logger licznikLogger = contextJava.getBean("getLicznikLogger", Logger.class);

    repozytorium.setLogger(loggerXML);

    repozytorium.zapisz(new Użytkownik("Kacper"));

    repozytorium.setLogger(nazwanyLogger);

    repozytorium.zapisz(new Użytkownik("Znowu Kacper"));

    repozytorium.setLogger(licznikLogger);

    repozytorium.zapisz(new Użytkownik("Bez niespodzianek - Kacper"));

  }
}
