package autowire.exerciseTwo.service;

import static autowire.exerciseTwo.common.Color.BLUE;
import static autowire.exerciseTwo.common.Color.RESET;

import autowire.exerciseTwo.domain.Klient;
import autowire.exerciseTwo.domain.Salon;
import autowire.exerciseTwo.domain.Samochód;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Marcin Ogorzalek
 */
@Service
public class WynajęcieService {

  private KlientService klientService;
  private SalonService salonService;

  @Autowired
  public void setKlientService(KlientService klientService) {
    this.klientService = klientService;
  }

  @Autowired
  public void setSalonService(SalonService salonService) {
    this.salonService = salonService;
  }

  public void wydajSamochód(Klient kient, Samochód samochód, Salon salon) {
    System.out.println(
        new StringBuilder()
            .append(BLUE)
            .append("Rozpoczęcie procesu wypożyczania")
            .append(RESET)
            .toString()
    );
    salonService.wynajmijSamochód(salon, samochód);
    klientService.obciążKlienta(kient, samochód);
    System.out.println(
        new StringBuilder()
            .append(BLUE)
            .append("Wydano samochód klientowi")
            .append(RESET)
            .toString()
    );

  }
}
