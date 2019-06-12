package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.szpiedzy.AustinPowers;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.szpiedzy.JamesBond;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.szpiedzy.Szpieg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * WAŻNE: Aby uzyskać instrukcję umieść kursor na b_wstrzykiwanie_przez_konstruktor (sama góra tego pliku) i wciśnij Ctrl+q
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
