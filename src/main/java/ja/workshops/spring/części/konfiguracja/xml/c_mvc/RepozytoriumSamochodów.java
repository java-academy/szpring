package ja.workshops.spring.części.konfiguracja.xml.c_mvc;

import ja.workshops.spring.części.konfiguracja.xml.c_mvc.silnik.Benzyna;
import ja.workshops.spring.części.konfiguracja.xml.c_mvc.silnik.OlejNapędowy;

import java.util.Arrays;
import java.util.List;

/**
 * Implementacja, która imituje bazę danych samochodów, które są w komisie.
 * Dostęp do bazy danych w założeniu wzorca Model-Widok-Kontroler ma warstwa modelu, w tym wypadku {@link SerwisSamochodowy}
 *
 * @author Wiktor Rup
 */
public class RepozytoriumSamochodów {

    private List<Samochód> samochody;


    public RepozytoriumSamochodów() {

        samochody = Arrays.asList(new Samochód(1L, "Ford", new OlejNapędowy()),
                new Samochód(2L, "Alfa Romeo", new Benzyna()),
                new Samochód(3L, "Mazda", new Benzyna()),
                new Samochód(4L, "Ferrari", new OlejNapędowy()),
                new Samochód(5L, "Fiat", new OlejNapędowy())
        );
    }


    Samochód wynajmijSamochódPoId(Long id) {
        id = id % samochody.size();
        for (Samochód samochód : samochody) {
            if (samochód.getId() == id) {
                return samochód;
            }
        }
        //Zwracanie nullka w tym przypadku jest złe, tym bardziej gdy jest to repozytorium. Nie róbcie tak.
        return null;
    }
}