package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.szpiedzy;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.drinki.Drink;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.złoczyńcy.Złoczyńca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * imie = Austin
 * nazwisko = Powers
 * złoczyńca = DrEvil
 * drink = CubaLibre
 *
 * @author Jakub Czajka
 */
@Component
public class AustinPowers extends Szpieg {

    @Autowired
    public AustinPowers(@Qualifier("Evil") Złoczyńca złoczyńca, @Qualifier("CubaLibre") Drink drink, @Value("Austin") String imię, @Value("Powers")String nazwisko) {
        super(złoczyńca, drink, imię, nazwisko);
    }
}
