package autowire.C_exerciseTwo.service;

import autowire.C_exerciseTwo.data.repository.PraconikRepository;
import autowire.C_exerciseTwo.domain.Pracownik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Marcin Ogorzalek
 */
@Service
public class PracownikService {

  private PraconikRepository praconikRepository;

  @Autowired
  public void setPraconikRepository(PraconikRepository praconikRepository) {
    this.praconikRepository = praconikRepository;
  }

  void przyznajPremię(Pracownik pracownik) {
    System.out.println("Przyznano premię pracownikowi: "+pracownik);
    praconikRepository.zapisz(pracownik);
  }
}
