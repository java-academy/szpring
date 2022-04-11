package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytoria;

import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.ZIELONY;
import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.RESETUJ;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Samochód;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

/**
 * Odpowiada za utrwalenie informacji o samochodzie i dacie jego wypożyczenia
 *
 * @author Marcin Ogorzalek
 */
@Repository
public class RepozytoriumSamochodowe {

    public void zapis(Samochód samochód, LocalDate dataWypożyczenia) {
        System.out.println(ZIELONY + "Zapisuję datę wypożyczenia" + RESETUJ);
    }

}
