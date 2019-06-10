package autowire.D_init_and_destroy;

import autowire.D_init_and_destroy.api.Logger;
import autowire.D_init_and_destroy.api.RepozytoriumUżytkowników;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * WAŻNE: Umieść kursor na D_init_and_destroy (pierwsza linia tego pliku)
 * i wciśnij Ctrl+q w celu zobaczenia instrukcji.
 *
 * @author Kacper Staszek
 */
@ComponentScan(basePackages = "autowire.D_init_and_destroy")
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
