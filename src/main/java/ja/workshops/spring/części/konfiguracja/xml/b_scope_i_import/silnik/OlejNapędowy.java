package ja.workshops.spring.części.konfiguracja.xml.b_scope_i_import.silnik;

import ja.workshops.spring.części.konfiguracja.xml.b_scope_i_import.Samochód;

/**
 * Ziarno spingowe wstrzykiwane do klasy {@link Samochód Samochód}.
 *
 * @author Wiktor Rup
 */
public class OlejNapędowy implements Silnik {

    public String start() {
        return "Wrumm!";
    }
}
