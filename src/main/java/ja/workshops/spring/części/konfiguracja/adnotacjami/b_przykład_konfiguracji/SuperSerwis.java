package ja.workshops.spring.części.konfiguracja.adnotacjami.b_przykład_konfiguracji;

import org.springframework.stereotype.Service;

/**
 * Serwis! Czyli nasza otoczka na logikę biznesową... i to tyle.
 *
 * Jeśli macie jakąś własną logikę biznesową, wykonujecie jakieś obliczenia czy
 * używacie zewnętrznych API, serwis jest miejscem gdzie to umieszczacie.
 *
 * Q: What did the process say after working in an infinite loop all day?
 *
 * A: I need a break.
 *
 * @author Wojciech Makiela
 */
@Service("serwisAdnotacje")
class SuperSerwis {

    private RozsądneRepozytorium repozytorium;

    SuperSerwis(RozsądneRepozytorium repozytorium) {
        System.out.println(this.getClass().getName() + " - Konstruktor");
        this.repozytorium = repozytorium;
    }

    public void setRepozytorium(RozsądneRepozytorium repozytorium) {
        this.repozytorium = repozytorium;
    }

    String pobierzImieOsoby(int id) {
        return repozytorium.osobaOId(id).imie;
    }
}
