package autowire.C_exerciseTwo.service;

import static autowire.C_exerciseTwo.common.Color.BLUE;
import static autowire.C_exerciseTwo.common.Color.RESET;

import autowire.C_exerciseTwo.domain.Klient;
import autowire.C_exerciseTwo.domain.Salon;
import autowire.C_exerciseTwo.domain.Samochód;

/**
 * @author Marcin Ogorzalek
 */
public class WynajęcieService {

  private KlientService klientService;
  private SalonService salonService;

  public void setKlientService(KlientService klientService) {
    this.klientService = klientService;
  }

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
