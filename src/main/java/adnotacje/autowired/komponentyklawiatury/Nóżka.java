package adnotacje.autowired.komponentyklawiatury;

/**
 * Klasa, która reprezentuje Nóżki od klawiatury, czyli zależność, która zostaje wstrzyknięta do klasy Klawiatura przez konstruktor.
 *
 * @author Wiktor Rup
 */
class Nóżka implements KomponentKlawiatury {

    @Override
    public void robiRzeczy() {
        System.out.println("Łiiiip!");
    }
}
