package autowire.C_exerciseTwo.service;

import autowire.C_exerciseTwo.data.repository.PracownikRepository;
import autowire.C_exerciseTwo.domain.Pracownik;
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
