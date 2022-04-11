package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.serwisy;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytoria.RepozytoriumKlienckie;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Klient;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Samochód;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Marcin Ogorzalek
 */
@Service
class KlientSerwis {

    private RepozytoriumKlienckie repo;

    @Autowired
    public void setRepo(RepozytoriumKlienckie repo) {
        this.repo = repo;
    }

    void obciążKlienta(Klient klient, Samochód samochód) {
        System.out.printf("Zapisano datę wypożyczenia samochodu: %s przez klienta: %s%n", samochód, klient);
        repo.zapis(klient);
    }
}
