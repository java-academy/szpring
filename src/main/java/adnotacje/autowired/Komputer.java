package adnotacje.autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Klasa prezentująca działanie wstrzykiwania zależności na różne sposoby.
 *
 * @author Wiktor Rup
 */
class Komputer {

    private Klawiatura klawiatura;
    private Monitor monitor;


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
