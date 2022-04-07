package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.serwisy;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytoria.RepozytoriumPracownicze;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Pracownik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Marcin Ogorzalek
 */
class PracownikSerwis {

  private RepozytoriumPracownicze repo;

  public void setRepo(RepozytoriumPracownicze repo) {
    this.repo = repo;
  }

  void przyznajPremię(Pracownik pracownik) {
    System.out.printf("Przyznano premię pracownikowi: %s%n", pracownik);
    repo.zapisz(pracownik);
  }
}
