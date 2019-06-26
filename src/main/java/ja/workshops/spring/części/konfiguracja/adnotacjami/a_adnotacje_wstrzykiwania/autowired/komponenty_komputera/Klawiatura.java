package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.autowired.komponenty_komputera;

import ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.autowired.komponenty_klawiatury.KomponentKlawiatury;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Prezentacja działania adnotacji {@link Autowired}.
 *
 * @author Wiktor Rup
 * @see KomponentKlawiatury
 */
class Klawiatura implements KomponentKomputera {

    private final KomponentKlawiatury nóżka;

    private KomponentKlawiatury przycisk;
    /**
     * Wstrzykiwanie zależności przez dodanie adnotacji <code>@Autowired</code> na polu.
     * Ta metoda wstrzykiwania zależności jest niezalecana. Powody to:
     * - Nie ma możliwości zadeklarowania pola finalnego, niezmiennego.
     * - Łatwo złamać zasadę pojedynczej odpowiedzialności klasy, ponieważ wiele pól w klasie z adnotacją <code>@Autowired</code> wcale nie wygląda tak źle, a pod spodem i tak powstaje słoneczko.
     * - Nasza klasa staje się ściśle powiązana (jeżeli nie mamy setterów i getterów, a to główny cel stosowania wstrzykiwania przez pole) i jest wiązana przez springowy wstrzykiwacz klas,
     * co w rezultacie czyni klasę bezużyteczną poza springowym pojemnikiem.
     * - Korzystając ze wzorca wstrzykiwania zależności, powinny one być wyraźnie widoczne przez stosowanie interferjsu lub setterów. W przypadku wstrzykiwania przez pole zależności te są ukrywane.
     */
    @Autowired
    private KomponentKlawiatury dioda;

    /**
     * Wstrzykiwanie zależności przez dodanie adnotacji <code>@Autowired</code> na konstrukotrze.
     * Najbardziej preferowany sposób wstrzykiwania zależności. Mamy wówczas pewność że dana klasa (ziarno) jest od początku inicjalizowana ze wszystkimi wymaganymi zależnościami.
     *
     * @param nóżka - pole nóżka przekazywane przez konstruktor - zależność klasy.
     */
    @Autowired
    Klawiatura(KomponentKlawiatury nóżka) {
        this.nóżka = nóżka;
    }

    public KomponentKlawiatury getPrzycisk() {
        return przycisk;
    }

    /**
     * Wstrzykiwanie zależności przez dodanie adnotacji <code>Autowired</code> na setterze.
     *
     * @param przycisk - przycisk przekazywany przez metodę set, czyli nasza zależność.
     * @see KomponentKlawiatury
     */
    @Autowired
    public void setPrzycisk(KomponentKlawiatury przycisk) {
        this.przycisk = przycisk;
    }

    @Override
    public void status() {
        przycisk.robiRzeczy();
        nóżka.robiRzeczy();
        dioda.robiRzeczy();
        System.out.println("Klawiatura podłączona!\n");
    }
}
