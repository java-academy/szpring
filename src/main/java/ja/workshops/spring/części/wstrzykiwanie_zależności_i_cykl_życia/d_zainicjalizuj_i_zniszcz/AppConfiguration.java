package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz.api.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kacper Staszek
 */
@Configuration
class AppConfiguration {

  @Bean
  Logger getLicznikLogger(){
    return new LicznikLogger();
  }

  @Bean
  Logger getNazwanyLogger(){
    return new NazwanyLogger("Super Logger");
  }
}
