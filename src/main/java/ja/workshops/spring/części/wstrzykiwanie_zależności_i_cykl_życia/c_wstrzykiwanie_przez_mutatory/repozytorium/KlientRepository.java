package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytorium;

import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.ZIELONY;
import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.RESETUJ;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Klient;

/**
 * Odpowiada za utrwalenie informacji o kliencie wypożyczającym samochód
 *
 * @author Marcin Ogorzalek
 */
public class KlientRepository {

  public void zapis(Klient klient) {
    System.out.println(
        new StringBuilder().append(ZIELONY)
            .append("Zapisuję obciążenie klienta")
            .append(RESETUJ)
            .toString()
    );
  }
}
