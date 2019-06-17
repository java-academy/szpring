package ja.workshops.spring.części.konfiguracja.xml.b_scope_i_import;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Tworzymy i pobieramy kontekst aplikacji na podstawie plików konfiguracyjnych xml. {@link ApplicationContext}
 * Przykład pobrania instancji klasy Samochód (w tym wypadku ziarna) na podstawie pliku <pre>b_samochod_konfiguracja.xml</pre>.
 * Następnie wywołanie metody na obiekcie wstrzykniętym do klasy Samochód.
 *
 * @author Wiktor Rup
 */
class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("b/b_samochod_konfiguracja.xml");
        wsiądźIOdpalSamochód(context);
    }

    /**
     * Aby zauważyć różnicę pomiędzy podstawowymi zakresami ziaren w springu, należy zmienić wartość "scope" w pliku <pre>b_samochod_konfiguracja.xml</pre>
     *
     * Dlaczego zmiana wartości na "prototype" zmienia wydruk poniższej pętli?
     */
    private static void wsiądźIOdpalSamochód(ApplicationContext context) {
        for (int i = 0; i < 10; i++) {
            Samochód samochód = context.getBean(Samochód.class);
            System.out.println(samochód.getSilnik().start());
        }
    }
}
