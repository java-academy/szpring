/**
 * <p>W Springu możliwe jest zadeklarowanie ziarna świadomego kontekstu aplikacji w którym istnieje:
 * <a href="https://docs.spring.io/spring/docs/5.1.7.RELEASE/spring-framework-reference/core.html#beans-factory-aware">Świadome ziarna</a>.
 * Dzięki temu możliwe jest programowe odwołanie się do metod z {@link org.springframework.context.ApplicationContext ApplicationContext},
 * np. otrzymanie innych ziaren zadeklarowanych w danym kontekście.</p>
 * <br>
 * <p>Jesteśmy w stanie zrealizować to na dwa sposoby.
 * Możemy zaimplementować interface {@link org.springframework.context.ApplicationContextAware ApplicationContextAware}
 * albo poprzez adnotację {@code @Autowired} związaną z polem klasy odnoszącym się do {@code ApplicationContext}.</p>
 * <br>
 * <p>{@code ApplicationContextAware} jest jednym z podinterfejsów {@link org.springframework.beans.factory.Aware Aware}.
 * Inne interfejsy z niego dziedziczące są wymienione w poniższej dokumentacji:
 * <a href="https://docs.spring.io/spring/docs/5.1.7.RELEASE/spring-framework-reference/core.html#aware-list">podinterfejsy {@code Aware}</a></p>
 * <br>
 * <p>Generalnie niezalecane jest używanie {@code Aware}
 * i podinterfejsów ponieważ uzależnia (nie zależnie jak realizowane) to kod nasz od API Springa
 * oraz łamię zasadę odwrócenia kontroli (Inversion of Control).</p>
 * <br>
 * <p>Zapoznaj się z informacjami tu zawartymi:
 * <li>poczytaj te 5 linków z tej dokumentacji. Chociaż przez chwilę.</li>
 * <li>idź do {@link ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.f_ziarna_świadome_kontekstu.ZiarnaŚwiadomeKontekstuApp} i je odpal.</li>
 * <li>odkomentuj zakomentowany kod tamże, czy wyjątek faktycznie poleci? Dlaczego?</li>
 * <li>spróbuj wyciągnąć z kontekstu ziarno świadome swego imienia, wydrukuj to imię a potem je zmień.</li>
 * <li>wyciągnij ziarno raz jeszcze - czy zmiana jest trwała?</li>
 * <li>odpowiedz na pytania w metodzie {@code pytania()}, pisząc odpowiednie kawałki kodu pod pytaniami.</li>
 * </p>
 *
 * @author Marcin Ogorzalek
 */
package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.f_ziarna_świadome_kontekstu;