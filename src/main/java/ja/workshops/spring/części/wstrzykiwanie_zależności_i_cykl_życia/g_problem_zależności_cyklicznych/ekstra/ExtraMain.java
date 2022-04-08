package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.ekstra;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Demonstracja problemu z {@code @PostConstruct}. Pakiet ten wybija się z całego problemu cyklicznych zależności, wprowadzając więcej zagmatwania: postkonstrukcja, zależność ziaren i auto-okablowanie się tu splatają, formując niezły tygiel.
 *
 * @see ExtraMain#instrukcje()
 * @see <a href="https://docs.spring.io/spring-framework/docs/4.1.x/spring-framework-reference/html/beans.html#beans-dependency-resolution">Rozwiązywanie zależności cyklicznych w Springu</a>
 * @see <a href="https://stackoverflow.com/questions/29260676/spring-circular-dependencies-postconstruct-and-order-imposed-by-dependson">Pytanie z SO o porządek zdarzeń w tej sytuacji</a>, inspiracja dla niniejszego pakietu.
 * @author Tomasz @LAFK_pl Borek
 */
@ComponentScan(basePackages = {"ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.ekstra"})
class ExtraMain {

    /**
     * Zmień na true, jak spiszesz odpowiedź na pytanie:
     * <b>w jakiej kolejności Spring tu wykona operacje inicjacji ziaren?</b>
     */
    private final static boolean ROZUMIEM = true;

    public static void main(String[] args) {
        if (!ROZUMIEM) {
            System.out.println("Niepewnym czy rozumiesz.");
            return;
        }
        new AnnotationConfigApplicationContext(ExtraMain.class);
        instrukcje();
    }

    private static void instrukcje() {
        System.out.println("\n\n");
        System.out.println("Jeśli ujrzałeś, że oba ziarna są skonstruowane, to dobrze.");
        System.out.println("To idź do Ziarna A i odkomentuj linię. A potem porównaj oba rezultaty.");
        System.out.println("Teraz czas na Ziarno B. Odwiedź, odkomentuj, odpal, organoleptycznie oceń...");
        System.out.println("No, to co powiesz? Jak Spring tu działa jeśli obie linie są zakomentowane, obie odkomentowane, tylko jedna odkomentowana...?");
        System.out.println("Jak umiesz odpowiedzieć, ustaw ROZUMIEM na true... ;-)");
    }

}

