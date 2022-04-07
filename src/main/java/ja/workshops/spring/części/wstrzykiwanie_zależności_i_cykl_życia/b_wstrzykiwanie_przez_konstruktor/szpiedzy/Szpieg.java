package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.szpiedzy;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.drinki.Drink;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.złoczyńcy.Złoczyńca;

/**
 * Szpieg, czyli ostatnia linia obrony przeciwko wszelkiemu złu tego świata.
 * Klasa przechowuje informacje o szpiegu, jego przeciwniku i ulubionym napoju
 *
 * @author Jakub Czajka
 */
public class Szpieg {

    private String imię;
    private String nazwisko;
    private Drink drink;
    private Złoczyńca złoczyńca;

    public Szpieg(Złoczyńca złoczyńca, Drink drink, String imię, String nazwisko) {
        this.złoczyńca = złoczyńca;
        this.drink = drink;
        this.imię = imię;
        this.nazwisko = nazwisko;
    }

    /**
     * Szpieg przedstawia się z imienia i nazwiska, nawiązując pry tym do jednego z ikonicznych tajnych agentów
     */
    public void przedstawSię() {
        System.out.printf("Jestem %s, %s %s %n", nazwisko, imię, nazwisko);
    }

    /**
     * Szpieg zamawia swojego ulubionego drinka
     */
    public void zamówDrinka() {
        System.out.printf("Poproszę %s, %s%n", drink.getNazwa(), drink.przepis());
    }

    /**
     * Zdradza kto jest nemezis danego szpiega
     */
    public void mójWróg() {
        System.out.printf("Moim wrogiem jest %s%n", złoczyńca);
    }
}
