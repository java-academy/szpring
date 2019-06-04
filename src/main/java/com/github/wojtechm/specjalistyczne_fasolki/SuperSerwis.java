package com.github.wojtechm.specjalistyczne_fasolki;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Wojciech Makiela
 */
@Service
class SuperSerwis {

    @Autowired
    private RandomoweRepozytorium repozytorium;

    SuperSerwis() {
        System.out.println(this.getClass().getName() + " - Konstruktor");
    }

    public void setRepozytorium(RandomoweRepozytorium repozytorium) {
        this.repozytorium = repozytorium;
    }

    String pobierzImieOsoby(int id) {
        return repozytorium.osobaOId(id).imie;
    }
}
