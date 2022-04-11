package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytoria;

import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.ZIELONY;
import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.RESETUJ;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Klient;
import org.springframework.stereotype.Repository;

/**
 * Odpowiada za utrwalenie informacji o kliencie wypożyczającym samochód
 *
 * @author Marcin Ogorzalek
 */
@Repository
public class RepozytoriumKlienckie {

    public void zapis(Klient klient) {
        System.out.println(ZIELONY + "Zapisuję obciążenie klienta" + RESETUJ);
    }
}
