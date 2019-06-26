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

        /**
         * Główny element aplikacji, czyli ładowanie kontekstu.
         * Tworzony jest nowy kontekst aplikacji, ładowany z danego pliku konfiguracyjnego xml.
         * W tym momencie zdefiniowane ziarna zostają zainicjalizowane oraz zarządzane przez kontener springowy.
         * Ładowanie kontekstu wiąże się z przejściem przez etapy cyklu życia ziarna aż do post inicjalizacji.
         */
        ApplicationContext kontekst = new ClassPathXmlApplicationContext("RequiredBeans.xml");

        /**
         * Rzutowanie jest częścią kompilacji połączoną z działaniem programu. Aby go uniknąć, typ zwracany przez metodę <code>getBean()</code> musiałby być znany na etapie kompilacji.
         * Nazwa ziarna (jego id) nie definiuje bezpośrednio klasy. Z tego powodu konieczne jest rzutowanie. Nie jest to dobra praktyka, ponieważ istnieje możliwość wyrzucenia wyjątku {@link ClassCastException}.
         * Sprawdź inne implementacje metody <code>getBean()</code> w klasie {@link org.springframework.beans.factory.BeanFactory BeanFactory}.
         */
        Samochód samochód = (Samochód) kontekst.getBean("samochód");
        System.out.println("Rok produkcji: " + samochód.getRokProdukcji());
        System.out.println("Marka: " + samochód.getMarka());
    }
}
