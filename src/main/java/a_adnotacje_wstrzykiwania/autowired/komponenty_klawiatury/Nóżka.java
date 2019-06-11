package a_adnotacje_wstrzykiwania.autowired.komponenty_klawiatury;

/**
 * Reprezentacja Nóżki od klawiatury, czyli zależność, która zostaje wstrzyknięta do klasy Klawiatura przez konstruktor.
 *
 * @author Wiktor Rup
 * @see KomponentKlawiatury
 */
class Nóżka implements KomponentKlawiatury {

    @Override
    public void robiRzeczy() {
        System.out.println("Łiiiip!");
    }
}
