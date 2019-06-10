package autowire.C_exerciseTwo.service;

import autowire.C_exerciseTwo.data.repository.PracownikRepository;
import autowire.C_exerciseTwo.domain.Pracownik;

/**
 * @author Marcin Ogorzalek
 */
public class PracownikService {

  private PracownikRepository pracownikRepository;

  public void setPracownikRepository(PracownikRepository pracownikRepository) {
    this.pracownikRepository = pracownikRepository;
  }

  void przyznajPremię(Pracownik pracownik) {
    System.out.printf("Przyznano premię pracownikowi: %s%n", pracownik);
    pracownikRepository.zapisz(pracownik);
  }
}
