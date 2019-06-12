package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.serwis;

import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Color.BLUE;
import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Color.RESET;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Klient;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Salon;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Samochód;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Główna logika biznesowa aplikacji wywołująca pozostałe serwisy
 *
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
    System.out.println(BLUE+"Rozpoczęcie procesu wypożyczania"+RESET);
    salonService.wynajmijSamochód(salon, samochód);
    klientService.obciążKlienta(kient, samochód);
    System.out.println(BLUE+"Wydano samochód klientowi"+RESET);

  }
}
