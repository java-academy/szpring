package autowire.exerciseTwo.service;

import autowire.exerciseTwo.data.repository.KlientRepository;
import autowire.exerciseTwo.domain.Klient;
import autowire.exerciseTwo.domain.Samochód;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Marcin Ogorzalek
 */
@Service
public class KlientService {

  private KlientRepository klientRepository;

  @Autowired
  public void setKlientRepository(KlientRepository klientRepository) {
    this.klientRepository = klientRepository;
  }

  void obciążKlienta(Klient klient, Samochód samochód) {
    System.out
        .printf("Zapisano datę wypożyczenia samochodu: %s przez klienta: %s%n", samochód, klient);
    klientRepository.zapis(klient);
  }
}
