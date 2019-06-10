package wrup.spring.a_wstrzykiwanie_zależności;

import wrup.spring.b_scope_i_import.silnik.Silnik;

/**
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

    public void setSilnik(Silnik silnik) {
        this.silnik = silnik;
    }
}
