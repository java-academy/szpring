package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Klasa rozruchowa aplikacji. Tworzony jest {@link ApplicationContext kontekst aplikacji} springowej.
 *
 * @author Wiktor Rup
 */
class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("QualifierBeans.xml");

        /**
         * Kontekst aplikacji.
         * Rzutowanie jest częścią kompilacji połączoną z działaniem programu. Aby go uniknąć typ zwracany przez metodę getBean() musiałby być znany na etapie kompilacji.
         * Nazwa ziarna (jego id) nie definiuje bezpośrednio klasy. Z tego powodu konieczne jest rzutowanie. Nie jest to dobra praktyka, ponieważ istnieje możliwość wyrzucenia wyjątku ClassCastException.
         * Sprawdź inne implementacje metody getBean() w klasie {@link org.springframework.beans.factory.BeanFactory BeanFactory}
         */
        Elektrownia elektrownia = (Elektrownia) context.getBean("elektrownia");
        elektrownia.rodzajElektrowni();
    }


}
