package wrup.spring.b_scope_i_import.silnik;

/**
 * Ziarno spingowe wstrzykiwane do klasy Samochód {@link wrup.spring.b_scope_i_import.Samochód}
 *
 * @author Wiktor Rup
 */
public class OlejNapędowy implements Silnik {

    public String start() {
        return "Wrumm!";
    }
}
