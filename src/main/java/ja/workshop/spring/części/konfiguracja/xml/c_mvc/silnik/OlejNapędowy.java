package ja.workshop.spring.części.konfiguracja.xml.c_mvc.silnik;

/**
 * Ziarno spingowe wstrzykiwane do klasy {@link ja.workshop.spring.części.konfiguracja.xml.c_mvc.Samochód Samochód}.
 *
 * @author Wiktor Rup
 */
public class OlejNapędowy implements Silnik {

    public String start() {
        return "Wrumm!";
    }

    @Override
    public String toString() {
        return "OlejNapędowy";
    }
}
