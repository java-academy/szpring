package adnotacje.autowired;

/**
 * Klasa, która reprezentuje Monitor, czyli zależność, która zostaje wstrzyknięta do klasy Komputer za pomocą metody z parametrami {@link Komputer}
 * @author Wiktor Rup
 */
class Monitor {

    void status(){
        System.out.println("Monitor podłączony!");
    }
}
