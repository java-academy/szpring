package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.serwisy;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytoria.RepozytoriumSamochodowe;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Samochód;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * @author Marcin Ogorzalek
 */
@Service
class SamochódSerwis {

    private RepozytoriumSamochodowe repo;

    @Autowired
    public void setRepo(RepozytoriumSamochodowe repo) {
        this.repo = repo;
    }

    void wynajmijSamochód(Samochód samochód) {
        LocalDate dataWynajęciaSamochodu = LocalDate.now();
        System.out.printf("Wynajęto: %s, W dniu %s%n", samochód, dataWynajęciaSamochodu);
        repo.zapis(samochód, dataWynajęciaSamochodu);
    }
}
