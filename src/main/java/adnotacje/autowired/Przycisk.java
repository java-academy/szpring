package adnotacje.autowired;

/**
 * Klasa, która reprezentuje Przycisk, czyli zależność, która zostaje wstrzyknięta do klasy Klawiatura przez pole {@link Klawiatura}
 *
 * @author Wiktor Rup
 */
class Przycisk {


    void klik(){
        System.out.println("Klik...");
    }
}
