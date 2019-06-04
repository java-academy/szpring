package com.github.wojtechm.specjalistyczne_fasolki;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author Wojciech Makiela
 */
@Repository
class RandomoweRepozytorium {

    private List<OszołomionaOsoba> ludki;

    public RandomoweRepozytorium() {
        System.out.println(this.getClass().getName() + " - Konstruktor");

        ludki = Arrays.asList(new OszołomionaOsoba("Wojciech"),
                new OszołomionaOsoba("Jakub"),
                new OszołomionaOsoba("Krzysztof"),
                new OszołomionaOsoba("Marcin"),
                new OszołomionaOsoba("Kacper"),
                new OszołomionaOsoba("Agnieszka"),
                new OszołomionaOsoba("Kamil"),
                new OszołomionaOsoba("Aleksandra"),
                new OszołomionaOsoba("Bartek"),
                new OszołomionaOsoba("NKrzyś"),
                new OszołomionaOsoba("Wiktor"),
                new OszołomionaOsoba("Patryk")
        );
    }

    OszołomionaOsoba osobaOId(int id) {
        return ludki.get(id % ludki.size());
    }
}
