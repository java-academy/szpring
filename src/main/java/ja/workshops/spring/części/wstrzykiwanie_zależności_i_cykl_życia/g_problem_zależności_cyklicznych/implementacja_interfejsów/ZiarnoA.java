package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.implementacja_interfejsów;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Proste i miłe ziarno, potrafi się przywitać.
 *
 * @implSpec Tylko tu wprowadzamy zmiany
 * @author Jakub Czajka
 * @author Tomasz Borek
 */
@Component
class ZiarnoA {
    ZiarnoB ziarnoB;

    @Autowired
    public ZiarnoA(ZiarnoB ziarnoB) {
        this.ziarnoB = ziarnoB;
    }

    public void siemano() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ZiarnoA{ziarnoB=" + ziarnoB + '}'; // celowo nie String.format
    }
}
