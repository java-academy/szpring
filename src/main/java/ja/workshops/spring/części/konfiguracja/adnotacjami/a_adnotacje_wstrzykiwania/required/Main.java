package ja.workshops.spring.części.konfiguracja.adnotacjami.a_adnotacje_wstrzykiwania.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Klasa rozruchowa aplikacji. Tworzony jest {@link ApplicationContext kontekst aplikacji} springowej.
 *
 * @author Wiktor Rup
 */
class Main {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("RequiredBeans.xml");

        /**
         * Kontekst aplikacji.
         * Rzutowanie jest częścią kompilacji połączoną z działaniem programu. Aby go uniknąć typ zwracany przez metodę getBean() musiałby być znany na etapie kompilacji.
         * Nazwa ziarna (jego id) nie definiuje bezpośrednio klasy. Z tego powodu konieczne jest rzutowanie. Nie jest to dobra praktyka, ponieważ istnieje możliwość wyrzucenia wyjątku ClassCastException.
         * Sprawdź inne implementacje metody getBean() w klasie {@link org.springframework.beans.factory.BeanFactory BeanFactory}
         */
        Samochód samochód = (Samochód) context.getBean("samochód");
        System.out.println("Rok produkcji: " + samochód.getRokProdukcji());
        System.out.println("Marka: " + samochód.getMarka());
    }
}
