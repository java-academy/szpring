package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.mutator_wstrzykiwanie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *  Miłe i sympatyczne ziarno, potrafi się przywitać.
 *
 * @implNote Co uczyniłeś ziarnu A, powtórz tutaj.
 * @author Jakub Czajka
 */
@Component
class ZiarnoB {
    ZiarnoA ziarnoA;

    @Autowired
    public ZiarnoB(ZiarnoA ziarnoA) {
        System.out.println("Tworzę ziarno B");
        this.ziarnoA = ziarnoA;
    }

    public void siemano() {
        System.out.println("Witam jestem B");
    }
}