/**
 * Leniwa inicializacja.
 * <br><br>
 * Przeczytaj :
 * <a href = "https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Lazy.html">Lazy init</a><br><br>
 * Adnotacja {@code @Lazy} powoduje że obiekt zostanie zainicializowana dopiero kiedy się do niej odniesiemy, a wcześnie w jej miejsce zostanie wstawione proxy.
 * Udaj się do klasy Main i podąrzaj za wskazówakami.
 *
 * <ol>
 *   <li>
 *     Przejdź do {@link autowire.G_CircularDependency.leniwaInicializacja.ZiarnoA ZiarnoA}, po dokonaniu zmian uruchom klasę main i upewnij sie ze wszystko działa
 *   </li>
 * </ol>
 *
 * @author Jakub Czajka
 */
package autowire.G_CircularDependency.leniwaInicializacja;