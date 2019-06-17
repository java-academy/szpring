package ja.workshop.spring.części.konfiguracja.xml.b_scope_i_import.silnik;

/**
 * Ziarno springowe wstrzykiwane do klasy {@link ja.workshop.spring.części.konfiguracja.xml.b_scope_i_import.Samochód Samochód}.
 *
 * @author Wiktor Rup
 */
public class Benzyna implements Silnik {
    public String start() {
        return "Pyr pyr pyr...";
    }
}
