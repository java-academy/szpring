/**
 * <p>W Springu możliwe jest zadeklarowanie ziarna świadomego kontekstu aplikacji w którym istnieje:
 * <a href="https://docs.spring.io/spring/docs/5.1.7.RELEASE/spring-framework-reference/core.html#beans-factory-aware">Świadome ziarna</a>.
 * Dzięki temu możliwe jest programowe odwołanie się do metod z {@link org.springframework.context.ApplicationContext ApplicationContext},
 * np. otrzymanie innych ziaren zadeklarowanych w danym kontekście.</p>
 * <br>
 * <p>Jesteśmy w stanie zeralizować to na dwa sposoby.
 * Możemy zaimplementować interface {@link org.springframework.context.ApplicationContextAware ApplicationContextAware}
 * albo poprzez adnotację {@code @Autowired} związaną z polem klasy odnoszącym się do {@code ApplicationContext}.</p>
 * <br>
 * <p>{@code ApplicationContextAware} jest jedym z podinterfejsów {@link org.springframework.beans.factory.Aware Aware}.
 * Inne iterfejsy z niego dziedziczace są wymienione w poniższej dokumentacji:
 * <a href="https://docs.spring.io/spring/docs/5.1.7.RELEASE/spring-framework-reference/core.html#aware-list">podinterfejsy {@code Aware}</a></p>
 * <br>
 * <p>Generalnie niezalecane jest używanie {@code Aware}
 * i podinterfejsów ponieważ uzależnia (nie zależnie jak realizowane) to kod nasz od API Springa
 * oraz łąmię zasadę odwrócenia kontroli (Inversion of Control).</p>
 * <br>
 * <p>Zapoznaj się z informacjami tu zawartymi.</p>
 *
 * @author Marcin Ogorzalek
 */
package autowire.F_Aware;