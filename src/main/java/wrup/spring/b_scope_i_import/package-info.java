/**
 *
 * <h1>Prezentacja konfiguracji XML-owej!</h1>
 *
 * <p>Podczas zapoznania się z kodem w tym pakiecie poznasz sposoby definiowania kilku plików konfiguracyjnych.</p>
 * <p>Dowiesz się jaka jest różnica w zasięgach ziaren takich jak:</p>
 * <ul>
 * <li>singleton</li>
 * <li>prototype</li>
 * </ul>
 *
 * <h2> 1. Kilka plików konfiguracyjnych</h2>
 *      <p>W pakiecie dostępne są klasy z poprzedniego zadania. W katalogu resources w pakiecie b znajdują się pliki konfiguracyjne xml.</p>
 *      <p>Jak można zauważyć każde ziarno posiada swój własny plik konfiguracyjny.</p>
 *      <p>Zastanów się w jaki sposób możemy w takim wypadku wstrzykiwać zależności do klasy {@link wrup.spring.b_scope_i_import.Samochód}?</p>
 *
 *      <p>Spróbuj odpalić klasę {@link wrup.spring.b_scope_i_import.Main} a następnie napraw występujące problemy.</p>
 *      <p><b>Podpowiedź: modyfikacja pliku <pre>b_samochod_konfiguracja.xml</pre> <b>i skorzystanie z "import".</b></p></b>
 *
 * <h2> 2. Zasięg ziarna</h2>
 *     <p>Program działa, a na ekranie pojawia nam się dziesięć prób odpaleń samochodu.</p>
 *     <p>Zmodyfikuj właściwość "scope" w pliku <pre>b_samochod_konfiguracja.xml</pre> na wartość "prototype" i ponownie odpal program.</p>
 *     <p><b>Zastanów się nad przyczyną innego wyniku.</p></b>
 *
 * @author Wiktor Rup
 *
 */
package wrup.spring.b_scope_i_import;