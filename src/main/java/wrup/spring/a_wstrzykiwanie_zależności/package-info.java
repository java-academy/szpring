/**
 * Prezentacja konfiguracji XML-owej!
 *
 * Podczas zapoznania się z kodem w tym pakiecie poznasz sposoby definiowania ziaren springowych oraz wstrzykiwania zależności za pomocą konfiguracji XML.
 * Dowiesz się jak skonfigurować wstrzykiwanie zależności następującymi sposobami:
     * poprzez konstruktor
     * poprzez metodę setter
     * za pomocą fabryki ziaren
 *
 *
 * 1. Definiowanie ziaren
 *      W pakiecie dostępna jest klasa {@link wrup.spring.a_wstrzykiwanie_zależności.Samochód Samochód}
 *      Tę klasę będziemy chcieli zadeklarować jako ziarno springowe naszej aplikacji.
 *      Spróbuj odpalić klasę {@link wrup.spring.a_wstrzykiwanie_zależności.Main Main} a następnie naprawić występujący problem.
 *
 *      Dodaj deklarację ziarna "samochód" w pliku konfiguracyjnym <pre>a_konfiguracja.xml</pre> w pakiecie <pre>resources/a</pre>
 *      W razie problemów wspomóż się prezentacją.
 *
 * 2. Wstrzykiwanie zależności
 *      W pakiecie znajdują się dwie klasy {@link wrup.spring.a_wstrzykiwanie_zależności.silnik.Benzyna Benzyna} oraz {@link wrup.spring.a_wstrzykiwanie_zależności.silnik.OlejNapędowy OlejNapędowy}
 *      Reprezentują one zależność, którą chcemy mieć w klasie {@link wrup.spring.a_wstrzykiwanie_zależności.Samochód Samochód}.
 *      Każdy samochód ma silnik, a silnik ten może być silnikiem napędzanym benzyną lub olejem napędowym.
 *
 *      Odkomentuj linię 23 w klasie {@link wrup.spring.a_wstrzykiwanie_zależności.Main Main} i spróbuj naprawić problem, który się pojawił.
 *      Zadeklaruj ziarna w pliku <pre>a_konfiguracja.xml</pre> tak jak zrobiliśmy to w przypadku klasy Samochód.
 *
 *      Czy problem zniknął?
 *
 *      2.1 Wstrzykiwanie przez setter
 *          Problem isniteje nadal, ponieważ zdefiniowaliśmy jedynie nowe ziarna w naszej aplikacji, ale nie powiązaliśmy żadnego z nich z naszą klasą Samochód.
 *          Odwołując się do prezentacji spróbuj w pliku <pre>a_konfiguracja.xml</pre> wstrzyknąć do ziarna "samochód" jeden z silników które zadeklarowałeś. (skorzystaj z właściwosći "property")
 *
 *          Odpal aplikację raz jeszcze i sprawdź, czy problem został zażegnany. Hmm...chyba czegoś brakuje. Przeczytaj błąd, który się pojawia i zmodyfikuj klasę Samochód tak by program zadziałał.
 *
 *
 *      2.2 Wstrzykiwanie przez konstruktor
 *          Nasza aplikacja działa i ma się dobrze, aczkolwiek zależność wstrzyknięta została z wykorzystniem metody set. Nie jest to zalecana forma wstrzykiwania zależności.
 *          Spróbujmy, więc wykorzystać konstruktor naszej klasy Samochód.
 *
 *          Zmodyfikuj konfigurację wstrzykiwania zależności w pliku <pre>a_konfiguracja.xml</pre> wykorzystując właściwość "constructor-arg" zamiast właściwości "property".
 *
 *
 *      2.3 Fabryka ziaren
 *          W pakiecie znajduje się klasa {@link wrup.spring.a_wstrzykiwanie_zależności.silnik.FabryczkaZiarenSilników FabryczkaZiarenSilników}.
 *          W pliku <pre>a_konfiguracja.xml</pre> odkomentuj linie .. - .. i spróbuj dokończyć implementację wstrzykiwania zależności z wykorzystaniem fabryki ziaren.
 *
 *
 * @author Wiktor Rup
 */
package wrup.spring.a_wstrzykiwanie_zależności;