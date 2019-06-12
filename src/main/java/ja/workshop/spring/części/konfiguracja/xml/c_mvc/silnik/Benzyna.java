package ja.workshop.spring.części.konfiguracja.xml.c_mvc.silnik;

/**
 * Ziarno springowe wstrzykiwane do klasy {@link ja.workshop.spring.części.konfiguracja.xml.c_mvc.Samochód Samochód}.
 *
 * @author Wiktor Rup
 */
public class Benzyna implements Silnik {
    public String start() {
        return "Pyr pyr pyr...";
    }

    @Override
    public String toString() {
        return "Benzyna";
    }
}
