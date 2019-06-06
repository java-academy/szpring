package autowire.C_exerciseTwo.service;

import autowire.C_exerciseTwo.data.repository.KlientRepository;
import autowire.C_exerciseTwo.domain.Klient;
import autowire.C_exerciseTwo.domain.Samochód;
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
    System.out.println("Zapisano datę wypożyczenia samochodu: "+samochód+" przez klienta: "+klient);
    klientRepository.zapis(klient);
  }
}
