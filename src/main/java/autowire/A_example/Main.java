package autowire.A_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * WAŻNE: Umieść kursor na A_example na górze tego pliku i wciśnij ctrl+q w celu zobaczenia instukcji.
 * @author Kacper Staszek
 */
@ComponentScan(basePackages = "autowire.A_example")
class Main {

  public static void main(String[] args) throws InterruptedException {
    ApplicationContext kontekst = new AnnotationConfigApplicationContext(Main.class);

    KonceptA ziarnoA = kontekst.getBean(KonceptA.class);
    ziarnoA.funckcjaA();

    KonceptB ziarnoB = kontekst.getBean(KonceptB.class);
    ziarnoB.funkcjaB();

    KonceptC ziarnoC = kontekst.getBean("konceptCImplDwa", KonceptC.class);
    ziarnoC.funkcjaC();

    Thread.sleep(2000);
    KonceptD ziarnoD = kontekst.getBean(KonceptD.class);
    ziarnoD.funkcjaD();
  }

}
