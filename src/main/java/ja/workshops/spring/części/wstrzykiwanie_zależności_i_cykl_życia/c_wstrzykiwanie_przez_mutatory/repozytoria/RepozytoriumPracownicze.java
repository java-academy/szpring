package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytoria;

import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.ZIELONY;
import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.RESETUJ;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Pracownik;
import org.springframework.stereotype.Repository;

/**
 * Odpowiada za utrwalenie informacji o pracowniku
 * dla którego przyzano premię za wypożyczenie samochodu
 *
 * @author Marcin Ogorzalek
 */
public class RepozytoriumPracownicze {

    public void zapisz(Pracownik pracownik) {
        System.out.println(ZIELONY + "Zapisuję informacje o premii dla pracownika" + RESETUJ);
    }
}
