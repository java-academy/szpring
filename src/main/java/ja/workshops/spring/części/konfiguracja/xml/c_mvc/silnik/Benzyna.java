package ja.workshops.spring.części.konfiguracja.xml.c_mvc.silnik;

import ja.workshops.spring.części.konfiguracja.xml.c_mvc.Samochód;

/**
 * Ziarno springowe wstrzykiwane do klasy {@link Samochód Samochód}.
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
