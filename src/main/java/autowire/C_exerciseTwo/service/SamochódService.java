package autowire.C_exerciseTwo.service;

import autowire.C_exerciseTwo.data.repository.SamochódRepository;
import autowire.C_exerciseTwo.domain.Samochód;
import java.time.LocalDate;

/**
 * @author Marcin Ogorzalek
 */
public class SamochódService {

  private SamochódRepository samochódRepository;

  public void setSamochódRepository(
      SamochódRepository samochódRepository) {
    this.samochódRepository = samochódRepository;
  }

  void wynajmijSamochód(Samochód samochód) {
    LocalDate dataWynajęciaSamochodu = LocalDate.now();
    System.out.printf("Wynajęto: %s, W dniu %s%n", samochód, dataWynajęciaSamochodu);
    samochódRepository.zapis(samochód, dataWynajęciaSamochodu);
  }
}
