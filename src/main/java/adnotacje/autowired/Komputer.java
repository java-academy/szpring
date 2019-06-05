package adnotacje.autowired;

import adnotacje.autowired.komponentykomputera.KomponentKomputera;
import adnotacje.autowired.komponentykomputera.IPort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
 * Klasa prezentująca działanie wstrzykiwania zależności na różne sposoby. {@link org.springframework.beans.factory.annotation.Autowired}
 *
 * @author Wiktor Rup
 */
class Komputer {

    private KomponentKomputera klawiatura;
    private KomponentKomputera monitor;
    @Autowired
    private Set<IPort> porty;


    /**
     * Metoda przedstawia mechanizm wstrzykiwania zależności poprzez dowolną metodę z parametrami.
     *
     * @param klawiatura
     * @param monitor
     */
    @Autowired
    void podłączKomponentyDoKomputera(KomponentKomputera klawiatura, KomponentKomputera monitor) {
        this.klawiatura = klawiatura;
        this.monitor = monitor;
    }

    void mojeKomponenty() {
        System.out.println("Komponenty komputera: ");
        klawiatura.status();
        monitor.status();
        for (IPort port : porty) {
            port.status();
        }
    }

}
