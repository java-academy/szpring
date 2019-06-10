package wrup.spring.a_wstrzykiwanie_zależności.silnik;

/**
 * Ziarno springowe wstrzykiwane do klasy Samochód {@link wrup.spring.a_wstrzykiwanie_zależności.Samochód}
 *
 * @author Wiktor Rup
 */
public class Benzyna implements Silnik {
    public String start() {
        return "Pyr pyr pyr...";
    }
}
