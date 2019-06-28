package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.serwis;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytorium.SalonRepository;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Pracownik;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Salon;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Samochód;

/**
 * @author Marcin Ogorzalek
 */
class SalonService {

  private SamochódService samochódService;
  private PracownikService pracownikService;
  private SalonRepository salonRepository;

  private Pracownik pracownik;

  public void setSamochódService(SamochódService samochódService) {
    this.samochódService = samochódService;
  }

  public void setPracownikService(PracownikService pracownikService) {
    this.pracownikService = pracownikService;
  }

  public void setSalonRepository(SalonRepository salonRepository) {
    this.salonRepository = salonRepository;
  }

  public void setPracownik(Pracownik pracownik) {
    this.pracownik = pracownik;
  }

  void wynajmijSamochód(Salon salon, Samochód samochód) {
    System.out.printf("Wynajęcie %s w salonie: %s%n", samochód, salon);
    samochódService.wynajmijSamochód(samochód);
    salonRepository.zapisz(salon, samochód);
    pracownikService.przyznajPremię(pracownik);
  }

}
