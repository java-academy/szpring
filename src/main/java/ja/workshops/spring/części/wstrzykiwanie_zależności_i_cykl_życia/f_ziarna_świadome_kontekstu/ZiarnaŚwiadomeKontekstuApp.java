package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.f_ziarna_świadome_kontekstu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * <p><b>WAŻNE: Aby uzyskać instrukcję umieść kursor na f_ziarna_świadome_kontekstu (sama góra tego pliku) i wyświetl JavaDoc pakietu (w IntelliJu Ctrl+q)</b></p>
 *
 * @author Marcin Ogorzalek
 */
@ComponentScan(basePackages = {"ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.f_ziarna_świadome_kontekstu"})
class ZiarnaŚwiadomeKontekstuApp {

  public static void main(String[] args) {
    ApplicationContext kontekst = new AnnotationConfigApplicationContext(ZiarnaŚwiadomeKontekstuApp.class);
    kontekst.getBean(ŚwiadomeZiarnoAdnotacja.class).użycieZiarna();
    kontekst.getBean(ŚwiadomeZiarnoIntaface.class).użycieZiarna();
// FIXME: odkomentowanie poniższego wywołania spowoduje NullPointerException.
//    kontekst.getBean(NieświadomeZiarno.class).kontekstAplikacji.getBean(Ziarno.class).metodaZiarenka();
//    możliwe jest uzyskanie dowolnego ziarna obecnego w danym kontekście:
    kontekst
        .getBean(ŚwiadomeZiarnoIntaface.class)
        .kontekstAplikacjiInterfejs.getBean(ŚwiadomeZiarnoAdnotacja.class)
        .użycieZiarna();
      System.out.format("|%s|%n","-".repeat(60));
      pytania(kontekst);
  }

    private static void pytania(ApplicationContext kontekst) {
      //TODO: pod każdym pytaniem napisz odpowiedni kawałek kodu
      System.out.println("Ile ziaren jest zdefiniowanych w kontekście?");
      System.out.println("\t" + kontekst.getBeanDefinitionCount());
      System.out.println("Jak nazywa się ten kontekst?");
      System.out.println("\t podobno przyjazna ta nazwa być powinna a niezbyt jest. Ale co ja tam wiem: " + kontekst.getDisplayName());
      System.out.println("Kiedy wystartował ten kontekst?");
      System.out.println("\t wystartował o (uwzględnia strefę): " + Instant.ofEpochMilli(kontekst.getStartupDate()).plus(2, ChronoUnit.HOURS));
      System.out.println("A kiedy wystartował jego rodzic?");
      System.out.println("\tNie ma rodzica - getParent zwróci null");
      System.out.println("Jak wyciągnąć z kontekstu ziarno świadome swego imienia?");
      final ZiarnoŚwiadomeImienia zswi = kontekst.getBean(ZiarnoŚwiadomeImienia.class);
      System.out.println(zswi.nazwaZiarna);
      zswi.setBeanName("jakieś tam ziarno");
      System.out.println(zswi.nazwaZiarna);
      System.out.println("Na ponownie wyciągniętym ziarnie? " + kontekst.getBean(ZiarnoŚwiadomeImienia.class).nazwaZiarna);
    }
}
