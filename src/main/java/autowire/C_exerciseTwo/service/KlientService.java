package autowire.C_exerciseTwo.service;

import autowire.C_exerciseTwo.data.repository.KlientRepository;
import autowire.C_exerciseTwo.domain.Klient;
import autowire.C_exerciseTwo.domain.Samochód;

/**
 * @author Marcin Ogorzalek
 */
public class KlientService {

  private KlientRepository klientRepository;

  public void setKlientRepository(KlientRepository klientRepository) {
    this.klientRepository = klientRepository;
  }

  void obciążKlienta(Klient klient, Samochód samochód) {
    System.out
        .printf("Zapisano datę wypożyczenia samochodu: %s przez klienta: %s%n", samochód, klient);
    klientRepository.zapis(klient);
  }
}
