package autowire.G_CircularDependency.setterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka Usuń z konstuktora adnotacje @Autowired i usuń z niego przypisanie do
 * zmiennej zachowując wiadoość, stwórz setter i zdodaj do niego addnotację @Autowired
 */
@Component
class ZiarnoA {

  ZiarnoB ziarnoB;

  @Autowired
  public ZiarnoA(ZiarnoB ziarnoB) {
    this.ziarnoB = ziarnoB;
  }

  public void hello() {
    System.out.println("Witam jestem A");
  }
}