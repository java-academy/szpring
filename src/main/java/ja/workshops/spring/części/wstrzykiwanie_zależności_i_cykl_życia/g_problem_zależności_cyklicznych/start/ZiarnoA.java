package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Proste i miłe ziarno, potrafi się przywitać.
 *
 * @implSpec W przyszłości pewnie będziemy potrzebować ziarna B. Instynkt tak mi mówi. Dlatego przewidując to, już teraz je tu dałem. Sprytny ja!
 * @author Sprytny i Przewidujący Programista
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
