package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.serwis;

import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.NIEBIESKI;
import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.RESETUJ;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Klient;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Salon;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Samochód;

/**
 * Główna logika biznesowa aplikacji wywołujący pozostałe serwisy obsługujące wypożyczenie samochodu
 *
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
            .append(NIEBIESKI)
            .append("Rozpoczęcie procesu wypożyczania")
            .append(RESETUJ)
            .toString()
    );
    salonService.wynajmijSamochód(salon, samochód);
    klientService.obciążKlienta(kient, samochód);
    System.out.println(
        new StringBuilder()
            .append(NIEBIESKI)
            .append("Wydano samochód klientowi")
            .append(RESETUJ)
            .toString()
    );

  }
}
