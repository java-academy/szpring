package adnotacje.autowired.komponentykomputera;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author Wiktor Rup
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
