package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.f_ziarna_świadome_kontekstu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p><b>WAŻNE: Aby uzyskać instrukcję umieść kursor na f_ziarna_świadome_kontekstu (sama góra tego pliku) i wciśnij Ctrl+q</b></p>
 *
 * @author Marcin Ogorzalek
 */
@ComponentScan(basePackages = {"autowire.f_ziarna_świadome_kontekstu"})
public class ZiarnaŚwiadomeKontekstuApp {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(ZiarnaŚwiadomeKontekstuApp.class);
    context.getBean(ŚwiadomeZiarnoAdnotacja.class).użycieZiarna();
    context.getBean(ŚwiadomeZiarnoIntaface.class).użycieZiarna();
// FIXME: odkomentowanie poniższego wywołania spowoduje NullPointerException.
//    context.getBean(NieświadomeZiarno.class).applicationContextAdnotacja.getBean(Ziarno.class).metodaZiarenka();
// możliwe jest uzyskanie dowolnego ziarna obecnego w danym kontekście;
    context
        .getBean(ŚwiadomeZiarnoIntaface.class)
        .applicationContextInterface
        .getBean(ŚwiadomeZiarnoAdnotacja.class)
        .użycieZiarna();
  }

}
