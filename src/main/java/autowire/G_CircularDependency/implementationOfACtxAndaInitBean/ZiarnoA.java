package autowire.G_CircularDependency.implementationOfACtxAndaInitBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 * Dodaj do implemntacji ApplicationContextAware i InitializingBean. metoda setApplicationContext powinna umozliwic ci wyciagnięcie do zmiennej kontextu,
 * w metodzie afterPropertiesSet z pomocą kotextu zapisz ziarnoB w zmiennej;
 */
@Component
class ZiarnoA implements ApplicationContextAware, InitializingBean {

  ZiarnoB ziarnoB;

  ApplicationContext context;

  public ZiarnoA() {
    System.out.println("Tworzę ziarno A");
  }

  public void hello() {
    System.out.println("Witam jestem A");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    ziarnoB = context.getBean(ZiarnoB.class);
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    context = applicationContext;
  }
}
