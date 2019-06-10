package wrup.spring.a_wstrzykiwanie_zależności.silnik;

/**
 * Ziarno spingowe wstrzykiwane do klasy Samochód {@link wrup.spring.a_wstrzykiwanie_zależności.Samochód}
 *
 * @author Wiktor Rup
 */
public class OlejNapędowy implements Silnik {

    public String start() {
        return "Wrumm!";
    }
}
