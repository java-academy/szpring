package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.serwis;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytorium.PracownikRepository;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Pracownik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Marcin Ogorzalek
 */
@Service
public class PracownikService {

  private PracownikRepository pracownikRepository;

  @Autowired
  public void setPracownikRepository(PracownikRepository pracownikRepository) {
    this.pracownikRepository = pracownikRepository;
  }

  void przyznajPremię(Pracownik pracownik) {
    System.out.println("Przyznano premię pracownikowi: "+pracownik);
    pracownikRepository.zapisz(pracownik);
  }
}
