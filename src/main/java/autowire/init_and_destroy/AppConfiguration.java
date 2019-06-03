package autowire.init_and_destroy;

import autowire.init_and_destroy.api.Logger;
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
