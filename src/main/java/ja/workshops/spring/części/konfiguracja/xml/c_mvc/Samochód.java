package ja.workshops.spring.części.konfiguracja.xml.c_mvc;

import ja.workshops.spring.części.konfiguracja.xml.c_mvc.silnik.Silnik;

/**
 * Encja samochód, której reprezentacje trzymane są w lokalnej bazie danych {@link RepozytoriumSamochodów}.
 *
 * @author Wiktor Rup
 */
public class Samochód {

    private long id;
    private String nazwa;
    private Silnik silnik;

    public Samochód() {
    }

    public Samochód(long id, String nazwa, Silnik silnik) {
        this.id = id;
        this.nazwa = nazwa;
        this.silnik = silnik;
    }

    public Samochód(Silnik silnik) {
        this.silnik = silnik;
    }

    public void setSilnik(Silnik silnik) {
        this.silnik = silnik;
    }

    /**
     * Do poprawnego wyświetlenia interesujących nas danych w zwracanym modelu <pre>widok.jsp</pre> niezbędne są publiczne metody get.
     */
    public long getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Silnik getSilnik() {
        return silnik;
    }
}
