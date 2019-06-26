package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.required;


import org.springframework.beans.factory.annotation.Required;

/**
 * Przedstawienie działania adnotacji {@link Required}.
 * <p>
 * Od wersji 5.1 adnotacja <code>@Required</code> jest adnotacją przestarzałą z racji na to,
 * że wymagane zależności powinny być wstrzykiwane przez konstruktor.
 * <p>
 * <b>Do prezentacji działania adnotacji <code>@Required</code> zmienić wersję Springa na 5.0.9 w pliku <code>pom.xml</code>.</b>
 *
 * Adnotacja <code>@Required</code> wymusza na użytkowniku zdefiniowanie ziarna w pliku XML <b>wraz z wstrzykiwanymi wartościami</b>.
 * Dodanie tej adnotacji nad metodą setter narzuca <b>obowiązek podania wartości pola przy inicjalizacji ziarna</b>.
 * Jeżeli wartość pola nie zostanie podana w pliku XML, otrzymamy przy kompilacji wyjątek <code>BeanInitializationException</code>.
 * Podane wartości zostają przy tworzeniu ziarna wstrzyknięte za pomocą oznaczonych setterów.
 *
 * @author Wiktor Rup
 */
class Samochód {

    private Integer rokProdukcji;
    private String marka;

    Integer getRokProdukcji() {
        return rokProdukcji;
    }


    /**
     * Adnotacja <code>@Required</code> działa w drugim etapie cyklu życia, zaraz po inicjalizacji ziarna, czyli "populate properties".
     * Z perspektywy kodu, konstruktor naszego ziarna jest wywoływany, po czym następuje próba inicjalizacji wymaganych zmiennych.
     * Jeżeli przy definicji ziarna nie podaliśmy wymaganych wartości to otrzymamy wyjątek <code>BeanInitializationException</code>, a tworzenie ziarna zakończy się jeszcze przed etapem "BeanNameAware's".
     *
     * Cykl życia ziarna można zobaczyć w prezentacji (Spring - wtrzykiwanie zależności i cykl życia.pptx), która znajduje się w pakiecie <code>ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia</code>
     */
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
