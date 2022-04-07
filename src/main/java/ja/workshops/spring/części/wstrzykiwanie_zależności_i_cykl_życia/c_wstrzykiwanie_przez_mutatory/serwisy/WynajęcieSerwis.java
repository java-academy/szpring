package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.serwisy;

import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.NIEBIESKI;
import static ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny.Kolor.RESETUJ;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Klient;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Salon;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Samochód;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Główna logika biznesowa aplikacji wywołujący pozostałe serwisy obsługujące wypożyczenie samochodu
 *
 * @author Marcin Ogorzalek
 */
public class WynajęcieSerwis {

    private KlientSerwis klientSerwis;
    private SalonSerwis salonSerwis;

    public void setKlientService(KlientSerwis klientSerwis) {
        this.klientSerwis = klientSerwis;
    }

    public void setSalonSerwis(SalonSerwis salonSerwis) {
        this.salonSerwis = salonSerwis;
    }

    public void wydajSamochód(Klient kient, Samochód samochód, Salon salon) {
        System.out.println(NIEBIESKI + "Rozpoczęcie procesu wypożyczania" + RESETUJ);
        salonSerwis.wynajmijSamochód(salon, samochód);
        klientSerwis.obciążKlienta(kient, samochód);
        System.out.println(NIEBIESKI + "Wydano samochód klientowi" + RESETUJ);

    }
}
