/**
 *
 * <h1>Prezentacja konfiguracji XML-owej!</h1>
 *
 *  <p>Ostatnim zadaniem będzie konfiguracja prostej springowej aplikacji MVC.</p>
 *  <p>W tym pakiecie znajdziesz podstawowe komponenty obrazujące podział aplkiacji na model, widok i kontroler.</p>
 *  <p>Przeanalizuj wszystkie klasy z pakietu, a następnie na podstawie poprzednich dwóch zadań stwórz plik konfiguracyjny <font color="yellow">{@code c_konfiguracja_aplikacji.xml}</font> w pakiecie <font color="yellow">{@code resources/c}</font>,</p>
 *  <p>gdzie zdefiniujesz wszystkie potrzebne ziarna oraz zależności do działania aplikacji.</p>
 *
 *  <p>Do uruchomienia aplikacji wykorzystany zostanie serwer tomcat. Jego konfiguracja znajduje się w pliku <font color="yellow">{@code webapp/WEB-INF/web.xml}</font></p>
 *  <p>Aby uruchomić aplikację wpisz w terminalu:</p>
 *  <p><b>{@code mvn tomcat7:run}</b>
 *  <p>lub</p>
 *  <p><b>{@code mvn tomcat7:run -Dmaven.tomcat.port=8888}</b></p> w przypadku gdy Twój port 8080 jest zajęty.
 *  <p>Następnie wpisz w przeglądarkę adres: <b>localhost:<i>tutaj_odpowiedni_port/Spring/komis</i></b> i sprawdź działanie aplikacji.</p>
 *
 * @author Wiktor Rup
 */
package ja.workshops.spring.części.konfiguracja.xml.c_mvc;