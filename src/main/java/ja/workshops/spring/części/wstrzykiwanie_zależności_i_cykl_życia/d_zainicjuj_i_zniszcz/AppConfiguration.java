package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjuj_i_zniszcz;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjuj_i_zniszcz.api.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Konfiguracja aplikacji. Wg nas, przydadzą się tu dwie zaadnotowane metody. Może coś więcej. Ale co my tam wiemy.
 *
 * @author Kacper Staszek
 */
@Configuration
class AppConfiguration {

    @Bean("super logger")
    Logger nazwany() {
        return new NazwanyLogger("super logger, praojciec każdego");
    }

    @Bean("liczywpis")
    Logger zLicznikiem() {
        return new LicznikLogger();
    }

}
