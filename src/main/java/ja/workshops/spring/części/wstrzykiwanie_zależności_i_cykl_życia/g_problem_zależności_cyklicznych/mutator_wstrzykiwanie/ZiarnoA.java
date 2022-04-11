package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.mutator_wstrzykiwanie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Proste i miłe ziarno, potrafi się przywitać.
 *
 * @implNote Pakietowa dokumentacja ma instrukcję go dotyczącą.
 * @author Jakub Czajka
 */
@Component
class ZiarnoA {
    ZiarnoB ziarnoB;

    @Autowired
    void wstrzykujęZiarnoB(ZiarnoB ziarnoB) {
        this.ziarnoB = ziarnoB;
    }

    public void siemano() {
        System.out.println("Witam jestem A");
    }
}