package ja.workshop.spring.części.konfiguracja.xml.b_scope_i_import.silnik;

/**
 * Ziarno spingowe wstrzykiwane do klasy {@link ja.workshop.spring.części.konfiguracja.xml.b_scope_i_import.Samochód Samochód}.
 *
 * @author Wiktor Rup
 */
public class OlejNapędowy implements Silnik {

    public String start() {
        return "Wrumm!";
    }
}
