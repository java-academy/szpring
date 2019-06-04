package adnotacje.autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Klasa, która obrazuje działanie adnotacji Autowired {@link org.springframework.beans.factory.annotation.Autowired}
 *
 * @author Wiktor Rup
 */
class Klawiatura {

    private final Nóżka nóżka;

    private Przycisk przycisk;
    /**
     * Wsztrzykiwanie zależności przez dodanie adnotacji Autowired na polu.
     * Ta metoda wsztrzykiwania zależności nie jest zalecana. Powody to:
     *  - Nie ma możliwości zadeklarowania pola finalnego, niezmiennego.
     *  - Łatwo złamać zasadę pojedynczej odpowiedzialności klasy, ponieważ wiele pól w klasie z adnotacją Autowired wcale nie wygląda tak źle, a pod spodem dzieją się rzeczy i powstaje słoneczko.
     *  - Nasza klasa staje się ściśle powiązana (jeżeli nie mamy setterów i getterów, a to główny cel stosowania wstrzykiwania przez pole) i jest wiązana przez springowy wstrzykiwacz klas,
     *  co w rezultacie czyni klasę bezużyteczną poza springowym pojemnikiem.
     *  - Korzystając ze wzorca wstrzykiwania zależności powinny one być wyraźnie widoczne przez stosowanie interferjsu lub setterów. W przypadku wstrzykiwania przez pole zależności te są ukrywane.
     */
    @Autowired
    private Dioda dioda;

    /**
     * Wsztrzykiwanie zależności przez dodanie adnotacji Autowired na konstrukotrze.
     * Najbardziej preferowany sposób wstrzykiwania zależności. Mamy wówczas pewność że dana klasa (fasolka) jest od początku inicjalizowana ze wszystkimi wymaganymi zależnościami.
     * @param nóżka - pole nóżka przekazywane przez konstruktor - zależność klasy.
     */
    @Autowired
    Klawiatura(Nóżka nóżka) {
        this.nóżka = nóżka;
    }

    public Przycisk getPrzycisk() {
        return przycisk;
    }

    /**
     * Wstrzykiwanie zależności przez dodanie adnotacji Autowired na setterze
     *
     * @see Przycisk
     * @param przycisk - przycisk przekazywany przez metodę set, czyli nasza zależność
     */
    @Autowired
    public void setPrzycisk(Przycisk przycisk) {
        this.przycisk = przycisk;
    }

    void kliknięcie(){
        przycisk.klik();
    }

    void mignięcie(){
        dioda.mig();
    }

    void przekręcićNóżki(){
        nóżka.przekręcać();
    }

    void status(){
        System.out.println("Klawiatura podłączona");
    }
}
