package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.serwis;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytorium.PracownikRepository;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Pracownik;

/**
 * @author Marcin Ogorzalek
 */
class PracownikService {

  private PracownikRepository pracownikRepository;

  public void setPracownikRepository(PracownikRepository pracownikRepository) {
    this.pracownikRepository = pracownikRepository;
  }

  void przyznajPremię(Pracownik pracownik) {
    System.out.printf("Przyznano premię pracownikowi: %s%n", pracownik);
    pracownikRepository.zapisz(pracownik);
  }
}
