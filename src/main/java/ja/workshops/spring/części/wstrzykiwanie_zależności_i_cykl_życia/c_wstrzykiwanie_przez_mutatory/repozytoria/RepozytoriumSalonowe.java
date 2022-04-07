package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytoria;

import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.ZIELONY;
import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.RESETUJ;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Salon;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Samochód;
import org.springframework.stereotype.Repository;

/**
 * Odpowiada za utrwalenie informacji o samochodzie i salonie z którego go wypożyczono
 *
 * @author Marcin Ogorzalek
 */
public class RepozytoriumSalonowe {

    public void zapisz(Salon salon, Samochód samochód) {
        System.out.println(ZIELONY + "Zapisuję wypożyczenie samochodu z salonu" + RESETUJ);
    }
}
