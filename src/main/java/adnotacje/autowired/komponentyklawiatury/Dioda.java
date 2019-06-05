package adnotacje.autowired.komponentyklawiatury;

/**
 * Klasa, która reprezentuje Diodę, czyli zależność, która zostaje wstrzyknięta do klasy Klawiatura za pomocą settera.
 *
 * @author Wiktor Rup
 * @see KomponentKlawiatury
 */
class Dioda implements KomponentKlawiatury {

    @Override
    public void robiRzeczy() {
        System.out.println("mig...mig...");
    }
}
