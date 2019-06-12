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
        ApplicationContext context = new ClassPathXmlApplicationContext("a/a_konfiguracja.xml");
        Samochód samochód = context.getBean(Samochód.class);


        System.out.println(samochód.getSilnik().start());


    }
}
