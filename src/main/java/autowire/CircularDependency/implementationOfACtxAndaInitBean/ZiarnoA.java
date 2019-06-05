package autowire.CircularDependency.implementationOfACtxAndaInitBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 * Dodaj do implemntacji ApplicationContextAware i InitializingBean. metoda setApplicationContext powinna umozliwic ci wyciagnięcie do zmiennej kontextu,
 * w metodzie afterPropertiesSet z pomocą kotextu zapisz ziarnoB w zmiennej;
 */
@Component
class ZiarnoA {

  ZiarnoB ziarnoB;

  @Autowired
  public ZiarnoA(ZiarnoB ziarnoB) {
    this.ziarnoB = ziarnoB;
  }

  public void hello(){
    System.out.println("Witam jestem A");
  }
}
