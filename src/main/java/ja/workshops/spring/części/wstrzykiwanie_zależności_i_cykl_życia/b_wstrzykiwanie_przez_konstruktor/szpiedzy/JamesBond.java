package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.szpiedzy;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.drinki.Drink;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.złoczyńcy.Złoczyńca;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * imie = James
 * nazwisko = Bond
 * złoczyńca = DrNo
 * drink = Martini
 *
 * @author Jakub Czajka
 */
@Component
public class JamesBond extends Szpieg {

    public JamesBond(@Qualifier("No") Złoczyńca złoczyńca, @Qualifier("Martini") Drink drink) {
        super(złoczyńca, drink, "James", "Bond");
    }
}
