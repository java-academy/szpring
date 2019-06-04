package adnotacje.autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Klasa prezentująca działanie wstrzykiwania zależności na różne sposoby. {@link org.springframework.beans.factory.annotation.Autowired}
 *
 * @author Wiktor Rup
 */
class Komputer {

    private Klawiatura klawiatura;
    private Monitor monitor;


    /**
     * Metoda przedstawia mechanizm wstrzykiwania zależności przez dowolną metodę z parametrami.
     *
     * @param klawiatura
     * @param monitor
     */
    @Autowired
    void podłączKomponentyDoKomputera(Klawiatura klawiatura, Monitor monitor) {
        this.klawiatura = klawiatura;
        this.monitor = monitor;
    }

    void mojeKomponenty(){
        System.out.println("Komponenty: ");
        klawiatura.status();
        monitor.status();
    }

}
