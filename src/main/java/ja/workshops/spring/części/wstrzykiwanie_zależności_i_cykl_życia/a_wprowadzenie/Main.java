package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.a_wprowadzenie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.concurrent.TimeUnit;

/**
 * WAŻNE: Instrukcje są w pakietowym Javadoc. Aby je uzyskać: umieść kursor na {@code a_wprowadzenie} (sama góra tego pliku) i wyświetl JavaDoc pakietu (w IntelliJu Ctrl+q).
 * <p>
 * Odpowiednikiem XMLowym adnotacji {@code @ComponentScan} jest <context:component-scan base-package="ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.a_wprowadzenie" />
 *
 * @author Kacper Staszek
 */
@ComponentScan(basePackages = "ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.a_wprowadzenie")
class Main {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext kontekst = new AnnotationConfigApplicationContext(Main.class);

        KonceptA ziarnoA = kontekst.getBean(KonceptA.class);
        ziarnoA.funkcjaA();

        KonceptB ziarnoB = kontekst.getBean(KonceptB.class);
        ziarnoB.funkcjaB();

        KonceptC ziarnoC = kontekst.getBean("konceptCImplDwa", KonceptC.class);
        ziarnoC.funkcjaC();

        TimeUnit.SECONDS.sleep(2);
        System.out.println("Main: " + "=".repeat(40));
        KonceptD ziarnoD = kontekst.getBean(KonceptD.class);
        ziarnoD.funkcjaD();
        System.out.println("\n\nMain: Raz jeszcze: instrukcje są w pakietowym JavaDoc. Nanieś kursor na nazwę pakietu `a_wprowadzenie` lub skocz do `package-info.java`");
    }
}
