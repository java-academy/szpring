/**
 *
 * Prezentacja konfiguracji XML-owej!
 *
 *
 * Ostatnim zadaniem będzie konfiguracja prostej springowej aplikacji MVC.
 * W tym pakiecie znajdziesz podstawowe komponenty obrazujące podział aplkiacji na model, widok i kontroler.
 * Dowiesz się jaka jest różnica w zasięgach ziaren takich jak:
 * singleton
 * prototype
 *
 * 1. Kilka plików konfiguracyjnych
 *      W pakiecie dostępne są klasy z poprzedniego zadania. W katalogu resources w pakiecie b znajdują się pliki konfiguracyjne xml.
 *      Jak można zauważyć każde ziarno posiada swój własny plik konfiguracyjny.
 *      Zastanów się w jaki sposób możemy w takim wypadku wstrzykiwać zależności do klasy {@link wrup.spring.b_scope_i_import.Samochód}?
 *
 *      Spróbuj odpalić klasę {@link wrup.spring.b_scope_i_import.Main} a następnie napraw występujące problemy.
 *      Podpowiedź: modyfikacja pliku <pre>b_samochod_konfiguracja.xml</pre> i skorzystanie z "import".
 *
 * 2. Zasięg ziarna
 *      Program działa, a na ekranie pojawia nam się dziesięć prób odpaleń samochodu.
 *      Zmodyfikuj właściwość "scope" w pliku <pre>b_samochod_konfiguracja.xml</pre> na wartość "prototype" i ponownie odpal program.
 *      Zastanów się nad przyczyną innego wyniku.
 *
 *
 * @author Wiktor Rup
 */
package wrup.spring.c_mvc;