package autowire.bean_post_processor;

import java.lang.reflect.Field;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class MójBeanPostProcessor implements BeanPostProcessor {

  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    return bean;
  }

  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    if(bean instanceof DrugiSuperTyp){
      try {
        Field myString = bean.getClass().getDeclaredField("myString");
        myString.setAccessible(true);
        myString.set(bean,"Zmienione!");
      } catch (NoSuchFieldException | IllegalAccessException e) {
        e.printStackTrace();
      }
    }
    return bean;
  }
}
