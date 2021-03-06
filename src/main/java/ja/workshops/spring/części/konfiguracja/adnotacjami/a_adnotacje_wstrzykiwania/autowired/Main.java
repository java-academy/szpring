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


        /**
         * Główny element aplikacji, czyli ładowanie kontekstu.
         * Tworzony jest nowy kontekst aplikacji, ładowany z danego pliku konfiguracyjnego xml.
         * W tym momencie zdefiniowane ziarna zostają zainicjalizowane oraz zarządzane przez kontener springowy.
         * Ładowanie kontekstu wiąże się z przejściem przez etapy cyklu życia ziarna aż do post inicjalizacji.
         */
        ApplicationContext kontekst = new ClassPathXmlApplicationContext("AutowiredBeans.xml");


        /**
         * Rzutowanie jest częścią kompilacji połączoną z działaniem programu. Aby go uniknąć, typ zwracany przez metodę <code>getBean()</code> musiałby być znany na etapie kompilacji.
         * Nazwa ziarna (jego id) nie definiuje bezpośrednio klasy. Z tego powodu konieczne jest rzutowanie. Nie jest to dobra praktyka, ponieważ istnieje możliwość wyrzucenia wyjątku {@link ClassCastException}.
         * Sprawdź inne implementacje metody <code>getBean()</code> w klasie {@link org.springframework.beans.factory.BeanFactory BeanFactory}.
         */
        Komputer komputer = (Komputer) kontekst.getBean("komputer");
        komputer.mojeKomponenty();

    }
}
