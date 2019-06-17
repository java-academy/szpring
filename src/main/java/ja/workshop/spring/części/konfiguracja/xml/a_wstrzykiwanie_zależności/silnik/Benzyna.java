package ja.workshop.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności.silnik;

/**
 * Ziarno springowe wstrzykiwane do klasy {@link ja.workshop.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności.Samochód Samochód}.
 *
 * @author Wiktor Rup
 */
public class Benzyna implements Silnik {
    public String start() {
        return "Pyr pyr pyr...";
    }
}
