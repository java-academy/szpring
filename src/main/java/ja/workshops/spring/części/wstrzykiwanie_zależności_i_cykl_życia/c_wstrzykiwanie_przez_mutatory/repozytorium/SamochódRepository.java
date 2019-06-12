package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytorium;

import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.ZIELONY;
import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.RESETUJ;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Samochód;
import java.time.LocalDate;

/**
 * @author Marcin Ogorzalek
 */
public class SamochódRepository {

  public void zapis(Samochód smaochód, LocalDate dataWypożyczenia) {
    System.out.println(
        new StringBuilder()
            .append(ZIELONY)
            .append("Zapisuję datę wypożyczenia")
            .append(RESETUJ)
            .toString()
    );
  }

}
