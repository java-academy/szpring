package wrup.spring.c_mvc.silnik;

/**
 * Ziarno spingowe wstrzykiwane do klasy Samochód {@link wrup.spring.b_scope_i_import.Samochód Samochód}
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
