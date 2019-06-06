package autowire.C_exerciseTwo.service;

import autowire.C_exerciseTwo.data.repository.SalonRepository;
import autowire.C_exerciseTwo.domain.Pracownik;
import autowire.C_exerciseTwo.domain.Salon;
import autowire.C_exerciseTwo.domain.Samochód;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Marcin Ogorzalek
 */
@Service
public class SalonService {

  private SamochódService samochódService;
  private PracownikService pracownikService;
  private SalonRepository salonRepository;

  private Pracownik pracownik;

  @Autowired
  public void setSamochódService(SamochódService samochódService) {
    this.samochódService = samochódService;
  }

  @Autowired
  public void setPracownikService(PracownikService pracownikService) {
    this.pracownikService = pracownikService;
  }

  @Autowired
  public void setSalonRepository(SalonRepository salonRepository) {
    this.salonRepository = salonRepository;
  }

  @Autowired
  public void setPracownik(Pracownik pracownik) {
    this.pracownik = pracownik;
  }

  void wynajmijSamochód(Salon salon, Samochód samochód) {
    System.out.println("Wynajęcie "+samochód+" w salonie: "+salon);
    samochódService.wynajmijSamochód(samochód);
    salonRepository.zapisz(salon, samochód);
    pracownikService.przyznajPremię(pracownik);
  }

}
