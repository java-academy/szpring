package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.qualifier;

import ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.qualifier.komponenty_elektrowni.Reaktor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Reprezentacja działania adnotacji <code>@Qualifier</code>.
 *
 * @author Wiktor Rup
 * @see Qualifier
 */
public class Elektrownia {


    private Reaktor reaktor;

    /**
     * Wstrzyknięcie zależności za pomocą settera. Koniecznym jest zastosowanie adnotacji <code>@Qualifier</code> aby określić, które zirano ma zostać wstrzyknięte.
     * Interfejs Reaktor implementowany jest zarówno przez klasę ReaktorChemiczny jak i ReaktorJądrowy, dlatego należy zdefiniować konkretnie, które ziarno nas interesuje.
     *
     * <b>Zwróć uwagę, że wielkość liter w nazwie ziarna ma znaczenie!</b>
     * Możesz spróbować zmienić wielkość liter w wartości adnotacji <code>@Qualifier</code> i zaobserwować niechciany wynik kompilacji.
     *
     * @see Reaktor
     */
    @Autowired
    @Qualifier("reaktorchemiczny")
    public void setReaktor(Reaktor reaktor) {
        this.reaktor = reaktor;
    }

    void rodzajElektrowni() {
        reaktor.typ();
    }


}
