package adnotacje.autowired.komponentykomputera;


/**
 * Klasa, która reprezentuje Monitor, czyli zależność, która zostaje wstrzyknięta do klasy Komputer za pomocą metody z parametrami.
 *
 * @author Wiktor Rup
 * @see KomponentKomputera
 */
class Monitor implements KomponentKomputera {

    @Override
    public void status() {
        System.out.println("Monitor podłączony!");
    }
}
