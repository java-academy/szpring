package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.złoczyńcy;


import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 */
@Component("No")
class DrNo extends Złoczyńca {

    public DrNo() {
        super("Julius", "No", "DrNo");
    }
}
