package adnotacje.autowired.komponentykomputera;

import org.springframework.beans.factory.annotation.Required;

/**
 * Klasa, która reprezentuje port, czyli zależność, która zostaje wstrzyknięta do klasy Komputer za pomocą pola (kolekcja).
 *
 * @author Wiktor Rup
 * @see IPort
 */
class Port implements IPort {

    private String nazwa;

    @Override
    public void status() {
        System.out.println("Port " + nazwa + " aktywny!");
    }

    @Required
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
