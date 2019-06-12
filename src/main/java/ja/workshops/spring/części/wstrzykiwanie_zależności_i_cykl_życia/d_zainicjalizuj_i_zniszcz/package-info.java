/**
 * Podczas pracy z tym pakietem przećwiczysz różne sposoby konfiguracji aplikacji Springowej,
 * Dowiesz się czym są init i destroy methods, oraz jak ich użyć na kilka różnych sposobów.
 *
 * <br>
 *
 * Postępuj zgodnie z poniższymi instrukcjami:
 * <ol>
 *  <li>{@link ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz.Main Main}
 *  <ul>
 *    <li>
 *      Stwórz konfigurację do podanego szkieletu klas. Połącz wszytkie trzy typy konfiguracji.
 *    (repozytorium przez annotacje, dwa loggery z konfiguracji java, jeden z XML)
 *    </li>
 *    <li>
 *     Na 3 różne sposoby zaimplementuj metody init i destroy.
 *      <li><a href="https://www.mkyong.com/spring/spring-init-method-and-destroy-method-example/"> Init, destroy method</a></li>
 *      <li><a href="https://www.mkyong.com/spring/spring-postconstruct-and-predestroy-example/"> @PostConstruct, @PreDestroy</a></li>
 *      <li><a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/InitializingBean.html"> InitializingBean</a></li>
 *      <li><a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/DisposableBean.html">DisposableBean</a></li></li>
 *    </li>
 *    <li>Na potrzeby konfiguracji w XML stwórz plik konfiguracyjny, który osiągnie cel. (nazwij go konfiguracja.xml).</li>
 *  </ul>
 *
 * @author Kacper Staszek
 */
package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz;