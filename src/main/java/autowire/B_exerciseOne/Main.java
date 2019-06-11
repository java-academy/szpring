package autowire.B_exerciseOne;

import autowire.B_exerciseOne.szpiedzy.AustinPowers;
import autowire.B_exerciseOne.szpiedzy.JamesBond;
import autowire.B_exerciseOne.szpiedzy.Szpieg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * WAŻNE: Aby uzyskać instrukcję umieść kursor na B_exerciseOne (sama góra tego pliku) i wciśnij Ctrl+q
 *
 * @author Jakub Czajka
 */

class Main {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
    Szpieg szpieg1 = applicationContext.getBean(JamesBond.class);
    Szpieg szpieg2 = applicationContext.getBean(AustinPowers.class);
    szpieg1.przedstawSię();
    szpieg1.mójWróg();
    szpieg1.zamówDrinka();

    szpieg2.przedstawSię();
    szpieg2.mójWróg();
    szpieg2.zamówDrinka();

  }

}
