package autowire.exerciseTwo.service;

import autowire.exerciseTwo.data.repository.SamochódRepository;
import autowire.exerciseTwo.domain.Samochód;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Marcin Ogorzalek
 */
@Service
public class SamochódService {

  private SamochódRepository samochódRepository;

  @Autowired
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
