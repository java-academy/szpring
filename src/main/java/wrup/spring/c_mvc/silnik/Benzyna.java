package wrup.spring.c_mvc.silnik;

/**
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
