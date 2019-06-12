package wrup.spring.c_mvc;

import wrup.spring.c_mvc.silnik.Benzyna;
import wrup.spring.c_mvc.silnik.OlejNapędowy;

import java.util.Arrays;
import java.util.List;

/**
 * Repozytorium samochodów. Ziarno obrazujące warstwę, w której mamy dostęp do lokalnej bazy danych.
 *
 * @author Wiktor Rup
 */
public class RepozytoriumSamochodów {

    private List<Samochód> samochody;


    public RepozytoriumSamochodów() {

        samochody = Arrays.asList(new Samochód(1, "Ford", new OlejNapędowy()),
                new Samochód(2, "Alfa Romeo", new Benzyna()),
                new Samochód(3, "Mazda", new Benzyna()),
                new Samochód(4, "Ferrari", new OlejNapędowy()),
                new Samochód(5, "Fiat", new OlejNapędowy())
        );
    }

    //Brzydkie rozwiązanie, tylko w ramach prezentacji prostego mvc
    Samochód wynajmijSamochódPoId(Long id) {
        id = id % samochody.size();
        for (Samochód samochód : samochody) {
            if (samochód.getId() == id) {
                return samochód;
            }
        }
        return null;
    }
}