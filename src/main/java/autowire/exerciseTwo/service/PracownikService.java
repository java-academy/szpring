package autowire.exerciseTwo.service;

import autowire.exerciseTwo.data.repository.PraconikRepository;
import autowire.exerciseTwo.domain.Pracownik;

/**
 * @author Marcin Ogorzalek
 */
public class PracownikService {

  private PraconikRepository praconikRepository;

  public void setPraconikRepository(PraconikRepository praconikRepository) {
    this.praconikRepository = praconikRepository;
  }

  void przyznajPremię(Pracownik pracownik) {
    System.out.printf("Przyznano premię pracownikowi: %s%n", pracownik);
    praconikRepository.zapisz(pracownik);
  }
}
