package ja.workshop.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności.silnik;

/**
 * Ziarno spingowe wstrzykiwane do klasy {@link ja.workshop.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności.Samochód Samochód}.
 *
 * @author Wiktor Rup
 */
public class OlejNapędowy implements Silnik {

    public String start() {
        return "Wrumm!";
    }
}
