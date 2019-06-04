package adnotacje.autowired;

/**
 * Klasa, która reprezentuje Nóżki od klawiatury, czyli zależność, która zostaje wstrzyknięta do klasy Klawiatura przez konstruktor {@link Klawiatura}
 *
 * @author Wiktor Rup
 */
class Nóżka {

    void rozkładać(){
        System.out.println("Łiiiip!");
    }
}
