package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.złoczyńcy;

/**
 * Przebiegły i zły, arcyłotr, nemezis naszego bohatera
 *
 * @author Jakub Czajka
 */
public class Złoczyńca {

    private String imię;
    private String nazwisko;
    private String pseudonim;

    Złoczyńca(String imię, String nazwisko, String pseudonim) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.pseudonim = pseudonim;
    }

    @Override
    public String toString() {
        return pseudonim + " czyli " + imię + " " + nazwisko;
    }
}
