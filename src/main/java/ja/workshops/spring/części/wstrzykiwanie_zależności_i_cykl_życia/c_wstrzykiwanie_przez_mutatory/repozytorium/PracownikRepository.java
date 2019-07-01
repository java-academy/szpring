package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytorium;

import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.ZIELONY;
import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.RESETUJ;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Pracownik;

/**
 * Odpowiada za utrwalenie informacji o pracowniku
 * dla którego przyzano premię za wypożyczenie samochodu
 *
 * @author Marcin Ogorzalek
 */
public class PracownikRepository {

  public void zapisz(Pracownik pracownik) {
    System.out.println(
        new StringBuilder()
            .append(ZIELONY)
            .append("Zapisuję informacje o premii dla pracownika")
            .append(RESETUJ)
            .toString()
    );
  }
}
