package wrup.spring.c_mvc.silnik;

/**
 * Ziarno springowe wstrzykiwane do klasy Samochód {@link wrup.spring.b_scope_i_import.Samochód Samochód}
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
