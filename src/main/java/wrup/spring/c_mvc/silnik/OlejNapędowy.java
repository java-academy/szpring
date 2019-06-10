package wrup.spring.c_mvc.silnik;

/**
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
