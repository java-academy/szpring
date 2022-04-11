package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Proste i miłe ziarno, potrafi się przywitać.
 *
 * @implSpec Ewidentnie niepotrzebne nam było drugie ziarno. Nic w kodzie z niego nie korzystało. Wycięte zatem!
 * @author Sprytny i Przewidujący Programista
 */
@Component
class ZiarnoA {
    public void siemano() {
        System.out.println("Witam jestem A");
    }
}
