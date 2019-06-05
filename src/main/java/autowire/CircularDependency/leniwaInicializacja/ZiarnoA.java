package autowire.CircularDependency.leniwaInicializacja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 * W konstruktorze dopisz adnotacje @Lazy
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
