package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.autowired.komponenty_klawiatury;

/**
 * Reprezentacja przycisku, czyli zależność, która zostaje wstrzyknięta do klasy {@link a_adnotacje_wstrzykiwania.autowired.komponenty_komputera.Klawiatura Klawiatura} przez pole.
 *
 * @author Wiktor Rup
 * @see KomponentKlawiatury
 */
class Przycisk implements KomponentKlawiatury {

    @Override
    public void robiRzeczy() {
        System.out.println("Klik...");
    }
}
