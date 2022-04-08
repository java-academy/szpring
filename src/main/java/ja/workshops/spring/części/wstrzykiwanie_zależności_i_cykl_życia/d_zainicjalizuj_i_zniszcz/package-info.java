/**
 * Podczas pracy z tym pakietem przećwiczysz różne sposoby konfiguracji aplikacji Springowej,
 * Dowiesz się czym są metody {@code init} i {@code destroy}, oraz jak ich użyć na kilka różnych sposobów.
 *
 * <br>
 *
 * Postępuj zgodnie z poniższymi instrukcjami:
 * <ol>
 *  <li>Odwiedź i odpal {@link ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz.Main Main}. Zmieniasz tylko kod metody main.
 *  <li> Stwórz konfigurację do podanego szkieletu klas. Połącz wszystkie trzy typy konfiguracji.
 *    (repozytorium przez adnotacje, dwa loggery z konfiguracji java, jeden z XML)
 *  </li>
 *  <li>Na 3 różne sposoby zaimplementuj metody init i destroy:
 *  <ul>
 *      <li><a href="https://www.mkyong.com/spring/spring-init-method-and-destroy-method-example/">1. Init, destroy method</a></li>
 *      <li><a href="https://www.mkyong.com/spring/spring-postconstruct-and-predestroy-example/">2. @PostConstruct, @PreDestroy</a></li>
 *      <li><a href="https://stackoverflow.com/questions/3406555/why-use-postconstruct">2.a Pytanie z SO: po co nam PostConstruct?</a></li>
 *      <li><a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/InitializingBean.html">3.a. InitializingBean</a></li>
 *      <li><a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/DisposableBean.html">3.b. DisposableBean</a></li></li>
 *   </ul>
 *   </li>
 *    <li>Na potrzeby konfiguracji w XML stwórz plik konfiguracyjny, który osiągnie cel. Nazwij go wstrzykiwanie_zależności_i_cykl_życia.xml.</li>
 *  </ol>
 *
 * @author Kacper Staszek
 */
package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz;
