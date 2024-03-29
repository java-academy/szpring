package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.adnotacja_PostConstuct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Proste i miłe ziarno, potrafi się przywitać.
 *
 * @implSpec Konstrukcja tego ziarna będzie mieć krok PO.
 * @author Jakub Czajka
 */
@Component
class ZiarnoA {
    ZiarnoB ziarnoB;

    @Autowired
    public ZiarnoA(ZiarnoB ziarnoB) {
        this.ziarnoB = ziarnoB;
    }

    public void siemano() {
        System.out.println("Witam jestem A");
    }
}
