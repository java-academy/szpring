package adnotacje;


import org.springframework.beans.factory.annotation.Required;

/**
 * Klasa, która obrazuje działanie adnotacji Required {@link org.springframework.beans.factory.annotation.Required}
 * Od wersji 5.1 adnotacja @Required jest adnotacją przestarzałą z racji na to,
 * że wymagane zależności powinny być wstrzykiwane przez konstruktor.
 *
 * Do prezentacji działania adnotacji Required zmienić wersję Springa na 5.0.9.
 * @author Wiktor Rup
 */
class Samochód {

    private Integer rokProdukcji;
    private String marka;

    Integer getRokProdukcji() {
        return rokProdukcji;
    }

    @Required
    public void setRokProdukcji(Integer rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    String getMarka() {
        return marka;
    }

    @Required
    public void setMarka(String marka) {
        this.marka = marka;
    }
}
