/**
 * <h1>Adnotacja Autowired!</h1>
 *
 *  <p>Podczas zapoznania się z kodem w tym pakiecie poznasz sposoby wstrzykiwania zależności za pomocą adnotacji.</p>
 *  <p>Dowiesz się jak skonfigurować wstrzykiwanie zależności następującymi sposobami:</p>
 *  <ul>
 *      <li> poprzez konstruktor </li>
 *      <li> poprzez metodę setter </li>
 *      <li> poprzez pole</li>
 *  </ul>
 *
 *  Na początek zapoznaj się z klasami w pakiecie <font color="yellow"> {@code komponentyklawiatury} </font>.
 *  <p>Znajdziesz tam ziarna, które będą wstrzykiwane jako zależności do klasy {@link a_adnotacje_wstrzykiwania.autowired.komponentykomputera.Klawiatura Klawiatura}</p>
 *  <p>Ziarna te wstrzykiwane są na trzy podstawowe sposoby wymienione powyżej, tj: konstruktor, metoda setter oraz pole</p>
 *
 *  <p>Następnie możesz zerknąć na klasy w pakiecie <font color="yellow">{@code komponentykomputera}</font>. Klasy {@link a_adnotacje_wstrzykiwania.autowired.komponentykomputera.Monitor Monitro} oraz {@link a_adnotacje_wstrzykiwania.autowired.komponentykomputera.Port Port}
 *  są zależnościami wstrzykiwanymi do klasy {@link a_adnotacje_wstrzykiwania.autowired.Komputer Komputer} z wykorzystaniem metody z parametrami oraz kolekcji.</p>
 *  <p>W katalogu <font color="yellow">{@code resources}</font> znajduje się plik konfiguracyjny dla tego pakietu o nazwie {@code AutowiredBeans.xml}.
 *  Znajdziesz tam konfiguracje wykorzystywanych ziaren i zalezności.</p>
 *
 *
 * @author Wiktor Rup
 */
package a_adnotacje_wstrzykiwania.autowired;