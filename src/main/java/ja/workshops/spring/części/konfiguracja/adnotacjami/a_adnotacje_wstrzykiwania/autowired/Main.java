package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Tworzenie {@link ApplicationContext kontekstu aplikacji} springowej.
 *
 * @author Wiktor Rup
 */
class Main {

    public static void main(String[] args) {


        ApplicationContext kontekst = new ClassPathXmlApplicationContext("AutowiredBeans.xml");


        /**
         * Kontekst aplikacji.
         * Rzutowanie jest częścią kompilacji połączoną z działaniem programu. Aby go uniknąć typ zwracany przez metodę getBean() musiałby być znany na etapie kompilacji.
         * Nazwa ziarna (jego id) nie definiuje bezpośrednio klasy. Z tego powodu konieczne jest rzutowanie. Nie jest to dobra praktyka, ponieważ istnieje możliwość wyrzucenia wyjątku ClassCastException.
         * Sprawdź inne implementacje metody getBean() w klasie {@link org.springframework.beans.factory.BeanFactory BeanFactory}
         */
        Komputer komputer = (Komputer) kontekst.getBean("komputer");
        komputer.mojeKomponenty();

    }
}
