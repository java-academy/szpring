package adnotacje.qualifier.komponentyelektrowni;

/**
 * Klasa, która reprezentuje reaktor jądrowy, czyli zależność, która zostaje wstrzyknięta do klasy Elektrownia za pomocą settera.
 *
 * @author Wiktor Rup
 * @see Reaktor
 */
class ReaktorJądrowy implements Reaktor {
    @Override
    public void typ() {
        System.out.println("Reaktor jądrowy.");
    }
}
