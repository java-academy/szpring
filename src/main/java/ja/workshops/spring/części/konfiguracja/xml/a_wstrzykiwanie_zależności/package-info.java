/**
 * <h1>Prezentacja konfiguracji XML-owej!</h1>
 *
 *  <p>Podczas zapoznania się z kodem w tym pakiecie poznasz sposoby definiowania ziaren springowych oraz wstrzykiwania zależności za pomocą konfiguracji XML.</p>
 *  <p>Dowiesz się jak skonfigurować wstrzykiwanie zależności następującymi sposobami:</p>
 *  <ul>
 *      <li> przez konstruktor </li>
 *      <li> przez metodę setter </li>
 *      <li> za pomocą fabryki ziaren</li>
 *  </ul>
 *
 *  <h2>1. Definiowanie ziaren</h2>
 *      <p>W pakiecie dostępna jest klasa {@link ja.workshops.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności.Samochód Samochód}</p>
 *      <p>Tę klasę będziemy chcieli zadeklarować jako ziarno springowe naszej aplikacji.</p>
 *      <p>Spróbuj odpalić klasę {@link ja.workshops.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności.Main Main} a następnie naprawić występujący problem.</p>
 *
 *      <p>Dodaj deklarację ziarna "samochód" w pliku konfiguracyjnym <font color="yellow">{@code a_konfiguracja.xml}</font> w pakiecie <font color="yellow">{@code resources/a/}</font></p>
 *      <p>W razie problemów wspomóż się prezentacją.</p>
 *  <br>

 *  <h2>2. Wstrzykiwanie zależności</h2>
 *      <p>W pakiecie znajdują się dwie klasy {@link ja.workshops.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności.silnik.Benzyna Benzyna} oraz {@link ja.workshops.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności.silnik.OlejNapędowy OlejNapędowy}</p>
 *      <p>Reprezentują one zależność, którą chcemy mieć w klasie {@link ja.workshops.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności.Samochód Samochód}.</p>
 *      <p>Każdy samochód ma silnik, a silnik ten może być silnikiem napędzanym benzyną lub olejem napędowym.</p>
 *
 *      <p>Odkomentuj linię oznaczoną FIXME z datą 12 czerwca w klasie {@link ja.workshops.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności.Main Main} i spróbuj naprawić problem, który się pojawił.</p>
 *      <p>Zadeklaruj ziarna w pliku <font color="yellow">{@code a_konfiguracja.xml}</font> tak jak zrobiliśmy to w przypadku klasy Samochód.</p>
 *
 *      <p><b>Czy problem zniknął?</b></p>
 *  <br>
 *
 *      <h3> 2.1 Wstrzykiwanie przez setter: </h3>
 *          <p>Problem isniteje nadal, ponieważ zdefiniowaliśmy jedynie nowe ziarna w naszej aplikacji, ale nie powiązaliśmy żadnego z nich z naszą klasą Samochód.</p>
 *          <p>Odwołując się do prezentacji spróbuj w pliku <font color="yellow">{@code a_konfiguracja.xml}</font> wstrzyknąć do ziarna "samochód" jeden z silników które zadeklarowałeś. (<b><font color="red">skorzystaj z właściwosći <code>property</code>!</font></b>)</p>
 *
 *          <p>Odpal aplikację raz jeszcze i sprawdź, czy problem został zażegnany. Hmm...chyba czegoś brakuje. Przeczytaj błąd, który się pojawia i zmodyfikuj klasę Samochód tak by program zadziałał.</p>
 *      <br>
 *
 *      <h3>2.2 Wstrzykiwanie przez konstruktor</h3>
 *          <p>Nasza aplikacja działa i ma się dobrze, aczkolwiek zależność wstrzyknięta została z wykorzystniem metody set. Nie jest to zalecana forma wstrzykiwania zależności.</p>
 *          <p>Spróbujmy wykorzystać konstruktor naszej klasy Samochód.</p>
 *
 *          <p>Zmodyfikuj konfigurację wstrzykiwania zależności w pliku <font color="yellow">{@code a_konfiguracja.xml}</font> wykorzystując właściwość <code>constructor-arg</code> zamiast właściwości <code>property</code>.</p>
 *      <br>
 *
 *      <h3>2.3 Fabryka ziaren</h3>
 *          <p>W pakiecie znajduje się klasa {@link ja.workshops.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności.silnik.FabryczkaZiarenSilników FabryczkaZiarenSilników}.</p>
 *          <p>W pliku <font color="yellow">{@code a_konfiguracja.xml}</font> odkomentuj linie, które następują po <b><i>3. Wstrzykiwanie ziarna fabryką ziaren</i></b> i spróbuj dokończyć implementację wstrzykiwania zależności z wykorzystaniem fabryki ziaren.</p>
 *      <br>
 *  <p>Poniżej link do dokumentacji: </p>
 *  <a href='https://docs.spring.io/spring/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html'>Konfiguracja XML</a>
 *  <p><i><note> Dokumentacja dla wersji springa 4.3.x, w projekcie natomiast jest używana wersja 5.1.7. Syntaks używanej konfiguracja XML nie różni się między tymi werjsami.</note></i></p>
 * @author Wiktor Rup
 */
package ja.workshops.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności;