package ja.workshops.spring.części.konfiguracja.xml.c_mvc.silnik;

import ja.workshops.spring.części.konfiguracja.xml.c_mvc.Samochód;

/**
 * Ziarno spingowe wstrzykiwane do klasy {@link Samochód Samochód}.
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
