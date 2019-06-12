package ja.workshop.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Tworzymy i pobieramy kontekst aplikacji na podstawie plików konfiguracyjnych xml. {@link ApplicationContext}
 * Przykład pobrania instancji klasy Samochód (w tym wypadku ziarna) na podstawie pliku <pre>a_konfiguracja.xml</pre>.
 * Następnie wywołanie metody na obiekcie wstrzykniętym do klasy Samochód.
 *
 * @author Wiktor Rup
 */
class Main {

    public static void main(String[] args) {
        ApplicationContext kontekst = new ClassPathXmlApplicationContext("a/a_konfiguracja.xml");
        Samochód samochód = kontekst.getBean(Samochód.class);


        // FIXME: 12.06.19 - do odkomentowania w ramach zadania opisanego w pliku package-info.java
        //System.out.println(samochód.getSilnik().start());


    }
}
