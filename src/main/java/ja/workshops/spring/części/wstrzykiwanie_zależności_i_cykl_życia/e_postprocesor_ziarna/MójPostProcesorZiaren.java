package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.e_postprocesor_ziarna;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * Po procesowaniu ziaren JA wkraczam do akcji, cały na biało...
 *
 * @author Tomasz @LAFK_pl Borek
 */
@Component
class MójPostProcesorZiaren implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equalsIgnoreCase("pierwszySuperTypImplOne")) {
            bean = zmieńPole(bean, PierwszySuperTypImplOne.class, "Zmienione!");
        }
        else if (beanName.equalsIgnoreCase("drugiSuperTypImpl")) {
            bean = zmieńPole(bean, DrugiSuperTypImpl.class, "Zmienione również tutaj!");
        }
        return bean;
    }

    private Object zmieńPole(Object bean, Class<?> klazz, String msg) {
        try {
            Field myString = klazz.getDeclaredField("myString");
            myString.setAccessible(true);
            myString.set(bean,msg);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.err.println(e.getMessage());
        }
        return bean;
    }
}
