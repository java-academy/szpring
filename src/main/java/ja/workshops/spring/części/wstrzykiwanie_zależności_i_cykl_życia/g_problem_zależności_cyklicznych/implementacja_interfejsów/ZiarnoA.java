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
class ZiarnoA implements ApplicationContextAware, InitializingBean {
    ZiarnoB ziarnoB;
    ApplicationContext kontekst;
    /**
     *   Identyfikuje ziarno, jeśli potrzebujemy.
     *   Można rozważyć dostęp pakietowy, by móc wywołać BEZ pośrednictwa toString.
     */
    private static final int ID=1;

    public void siemano() {
        System.out.println(this);
    }

    @Override
    public String toString() {      // rozcinam cykliczne wołania kodem, asymetrią między ziarnami
        return "ZiarnoA(id:" +ID + "){ziarnoB=" + ziarnoB.getClass().getSimpleName() + '}'; // tu już mógłby być String.format
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        ziarnoB = kontekst.getBean(ZiarnoB.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        kontekst = applicationContext;
    }
}
