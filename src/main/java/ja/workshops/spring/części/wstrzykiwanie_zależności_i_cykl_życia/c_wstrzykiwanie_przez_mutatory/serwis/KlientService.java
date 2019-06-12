package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.serwis;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytorium.KlientRepository;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Klient;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Samochód;

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
