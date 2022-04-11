package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.serwisy;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytoria.RepozytoriumSalonowe;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Pracownik;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Salon;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Samochód;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Marcin Ogorzalek
 */
@Service
class SalonSerwis {

  private SamochódSerwis samochódService;
  private PracownikSerwis pracownikService;
  private RepozytoriumSalonowe salonRepository;

  private Pracownik pracownik;

    @Autowired
    public void setSamochódService(SamochódSerwis samochódService) {
    this.samochódService = samochódService;
  }

    @Autowired
    public void setPracownikService(PracownikSerwis pracownikService) {
    this.pracownikService = pracownikService;
  }

    @Autowired
    public void setSalonRepository(RepozytoriumSalonowe salonRepository) {
    this.salonRepository = salonRepository;
  }

    @Autowired
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
