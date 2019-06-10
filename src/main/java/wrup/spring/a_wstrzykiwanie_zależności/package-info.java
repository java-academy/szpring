/**
 * <h1>Prezentacja konfiguracji XML-owej!</h1>
 *
 * <p>Podczas zapoznania się z kodem w tym pakiecie poznasz sposoby definiowania ziaren springowych oraz wstrzykiwania zależności za pomocą konfiguracji XML.</p>
 * <p>Dowiesz się jak skonfigurować wstrzykiwanie zależności następującymi sposobami:</p>
 * <ul>
 * <li> poprzez konstruktor </li>
 * <li> poprzez metodę setter </li>
 * <li> za pomocą fabryki ziaren</li>
 *</ul>
 *
 *      <h2>1. Definiowanie ziaren</h2>
 *      <p>W pakiecie dostępna jest klasa {@link wrup.spring.a_wstrzykiwanie_zależności.Samochód Samochód}</p>
 *      Tę klasę będziemy chcieli zadeklarować jako ziarno springowe naszej aplikacji.
 *      <p>Spróbuj odpalić klasę {@link wrup.spring.a_wstrzykiwanie_zależności.Main Main} a następnie naprawić występujący problem.</p>
 *
 *      <p>Dodaj deklarację ziarna "samochód" w pliku konfiguracyjnym <pre>a_konfiguracja.xml</pre> w pakiecie <pre>resources/a</pre></p>
 *      <p>W razie problemów wspomóż się prezentacją.</p>
 *      <br>

 *     <h2>2. Wstrzykiwanie zależności</h2>
 *      <p>W pakiecie znajdują się dwie klasy {@link wrup.spring.a_wstrzykiwanie_zależności.silnik.Benzyna Benzyna} oraz {@link wrup.spring.a_wstrzykiwanie_zależności.silnik.OlejNapędowy OlejNapędowy}</p>
 *      <p>Reprezentują one zależność, którą chcemy mieć w klasie {@link wrup.spring.a_wstrzykiwanie_zależności.Samochód Samochód}.</p>
 *      <p>Każdy samochód ma silnik, a silnik ten może być silnikiem napędzanym benzyną lub olejem napędowym.</p>
 *
 *      <p>Odkomentuj linię 23 w klasie {@link wrup.spring.a_wstrzykiwanie_zależności.Main Main} i spróbuj naprawić problem, który się pojawił.</p>
 *      <p>Zadeklaruj ziarna w pliku <pre>a_konfiguracja.xml</pre> tak jak zrobiliśmy to w przypadku klasy Samochód.</p>
 *
 *      <p><b>Czy problem zniknął?</b></p>
 *      <br>
 *
 *      <h3> 2.1 Wstrzykiwanie przez setter: </h3>
 *          <p>Problem isniteje nadal, ponieważ zdefiniowaliśmy jedynie nowe ziarna w naszej aplikacji, ale nie powiązaliśmy żadnego z nich z naszą klasą Samochód.</p>
 *          <p>Odwołując się do prezentacji spróbuj w pliku <pre>a_konfiguracja.xml</pre> wstrzyknąć do ziarna "samochód" jeden z silników które zadeklarowałeś. (skorzystaj z właściwosći "property")</p>
 *
 *          <p>Odpal aplikację raz jeszcze i sprawdź, czy problem został zażegnany. Hmm...chyba czegoś brakuje. Przeczytaj błąd, który się pojawia i zmodyfikuj klasę Samochód tak by program zadziałał.</p>
 *
 *      <h3>2.2 Wstrzykiwanie przez konstruktor</h3>
 *          <p>Nasza aplikacja działa i ma się dobrze, aczkolwiek zależność wstrzyknięta została z wykorzystniem metody set. Nie jest to zalecana forma wstrzykiwania zależności.</p>
 *          <p>Spróbujmy, więc wykorzystać konstruktor naszej klasy Samochód.</p>
 *
 *          <p>Zmodyfikuj konfigurację wstrzykiwania zależności w pliku <pre>a_konfiguracja.xml</pre> wykorzystując właściwość "constructor-arg" zamiast właściwości "property".</p>
 *
 *      <h3>2.3 Fabryka ziaren</h3>
 *          <p>W pakiecie znajduje się klasa {@link wrup.spring.a_wstrzykiwanie_zależności.silnik.FabryczkaZiarenSilników FabryczkaZiarenSilników}.</p>
 *          <p>W pliku <pre>a_konfiguracja.xml</pre> odkomentuj linie .. - .. i spróbuj dokończyć implementację wstrzykiwania zależności z wykorzystaniem fabryki ziaren.</p>
 *
 * @author Wiktor Rup
 */
package wrup.spring.a_wstrzykiwanie_zależności;