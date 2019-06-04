package autowire.exerciseTwo.domain;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Marcin Ogorzalek
 */
public class Samochód {

  @Value("Czarna Wołga")
  private String marka;

  @Override
  public String toString() {
    return marka;
  }
}
