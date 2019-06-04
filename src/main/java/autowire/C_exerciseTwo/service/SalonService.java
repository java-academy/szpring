package autowire.C_exerciseTwo.service;

import autowire.C_exerciseTwo.data.repository.SalonRepository;
import autowire.C_exerciseTwo.domain.Pracownik;
import autowire.C_exerciseTwo.domain.Salon;
import autowire.C_exerciseTwo.domain.Samochód;

/**
 * @author Marcin Ogorzalek
 */
public class SalonService {

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
