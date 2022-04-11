package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.adnotacja_PostConstuct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Miłe i sympatyczne ziarno, potrafi się przywitać.
 *
 * @implSpec Klasa wygląda na taką, która będzie mutować.
 * @author Jakub Czajka
 */
@Component
class ZiarnoB {
    ZiarnoA ziarnoA;

    public ZiarnoB() {
        System.out.println("Tworzę ziarno B");
    }

    public void siemano() {
        System.out.println("Witam jestem B");
    }

    @Autowired
    public void mutujemy(ZiarnoA a) {
        this.ziarnoA = a;
    }
}