package autowire.G_CircularDependency.implementationOfACtxAndaInitBean;

import org.springframework.beans.factory.annotation.Autowired;
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
