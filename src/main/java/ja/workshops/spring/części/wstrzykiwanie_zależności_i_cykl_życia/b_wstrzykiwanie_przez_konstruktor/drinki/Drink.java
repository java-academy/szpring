package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.drinki;

/**
 * Każdy szpieg ma swój ulubiony napój, klasa przechowuje jego nazwę i przepis na niego
 *
 * @author Jakub Czajka
 */
public class Drink {

    private String nazwa;
    private String przepis;

    Drink(String nazwa, String przepis) {
        this.nazwa = nazwa;
        this.przepis = przepis;
    }

    /**
     * @return Przepis na drinka
     */
    public String przepis() {
        return przepis;
    }

    public String getNazwa() {
        return nazwa;
    }
}
