package wrup.spring.c_mvc;

import wrup.spring.c_mvc.silnik.Silnik;

/**
 * @author Wiktor Rup
 */
public class Samochód {

    private Long id;
    private String nazwa;
    private Silnik silnik;

    public Samochód() {
    }

    public Samochód(Long id, String nazwa, Silnik silnik) {
        this.id = id;
        this.nazwa = nazwa;
        this.silnik = silnik;
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

    public long getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }
}
