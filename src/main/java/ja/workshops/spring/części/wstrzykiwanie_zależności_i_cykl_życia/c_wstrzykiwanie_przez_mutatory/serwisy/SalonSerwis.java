package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.serwisy;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytoria.RepozytoriumSalonowe;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Pracownik;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Salon;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Samochód;
import org.springframework.stereotype.Service;

/**
 * @author Marcin Ogorzalek
 */
class SalonSerwis {

  private SamochódSerwis samochódService;
  private PracownikSerwis pracownikService;
  private RepozytoriumSalonowe salonRepository;

  private Pracownik pracownik;

  public void setSamochódService(SamochódSerwis samochódService) {
    this.samochódService = samochódService;
  }

  public void setPracownikService(PracownikSerwis pracownikService) {
    this.pracownikService = pracownikService;
  }

  public void setSalonRepository(RepozytoriumSalonowe salonRepository) {
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
