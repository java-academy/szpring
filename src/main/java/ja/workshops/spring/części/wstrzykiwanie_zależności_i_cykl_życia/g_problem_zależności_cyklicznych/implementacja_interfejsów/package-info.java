/**
 * Ostatnią alternatywą jest zaimplementowanie interfejsów:
 * <li>Bycia świadomym kontekstu aplikacji: <a href = "https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationContextAware.html">ApplicationContextAware</a></li><br><br>
 * <li>Inicjującego ziarna: <a href = "https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/InitializingBean.html">InitializingBean</a></li><br><br>
 * <br><br>
 * Pierwszy daje nam dostęp do kontekstu aplikacji. Tak, bycie świadomym oznacza posiadanie dostępu i możliwość korzystania zeń.
 * Drugi pozwala nam wpływać na inicjację ziaren. W tym celu możemy nadpisać metodę {@code afterPropertiesSet()}.
 *
 * <ol>
 *   Wszystkie operacje wykonujemy w klasie {@link ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.implementacja_interfejsów.ZiarnoA ZiarnoA}.
 *   <li>Odpal Main, zobacz stary błąd.</li>
 *   <li><b>Cykliczna Zależność</b> działa na k-torach, rozetnij to (wszystkie operacje w ziarnie A, pamiętaj!).</li>
 *   <li>Odpal Main, zobacz stary problem z inicjacją ziaren:
 *   <pre>
 * Tworzę ziarno B
 * ZiarnoA{ziarnoB=null}
 * ZiarnoB{ziarnoA=ZiarnoA{ziarnoB=null}}</pre>
 *   </li>
 *   <li>Ziarno ma być świadome kontekstu. Dodaj odpowiedni interfejs, nadpisz metodę.</li>
 *   <li>Metoda {@code setApplicationContext()} powinna umożliwić Ci wyciągnięcie kontekstu do zmiennej.</li>
 *   <li>Ziarno powinno też umożliwić modyfikację pól PO ich ustawieniu. Dodaj odpowiedni interfejs, nadpisz metodę.</li>
 *   <li>W metodzie {@code afterPropertiesSet} z pomocą wcześniej stworzonej zmiennej (z kontekstem), zainicjuj ziarno B w ziarnie A.</li>
 *   <li>Sprawdź, że wszystko* działa.</li>
 * </ol>
 * <b>Skończyłeś? Gratulacje!</b><br><br>
 *
 * <small>*czyli masz {@code StackOverflowError}. Może nie uwierzysz, ale wiele linii tam jest niemal identycznych, gdzie niemal to dokładnie 2 znaki. Czas naprawić metodę toString, ale cykliczna zależność już jest za nami, prawda? PRAWDA?!</small><br>
 * @see "To było ostatnie zadanie!"
 * @author Jakub Czajka
 */
package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.implementacja_interfejsów;