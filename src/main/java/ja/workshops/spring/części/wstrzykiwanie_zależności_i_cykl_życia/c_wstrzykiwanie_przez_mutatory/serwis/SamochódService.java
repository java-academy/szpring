package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.serwis;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytorium.SamochódRepository;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Samochód;
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
