package ja.workshops.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności;

import ja.workshops.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności.silnik.Silnik;

/**
 * Ziarno springowe, do którego wstrzykiwany zostaje {@link Silnik}.
 *
 * @author Wiktor Rup
 */
public class Samochód {


    private Silnik silnik;

    public Samochód() {
    }

    public Samochód(Silnik silnik) {
        this.silnik = silnik;
    }

    public Silnik getSilnik() {
        return silnik;
    }
}
