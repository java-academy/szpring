package autowire.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Imituje funkcjonalność
 *
 * TODO:
 *  1.Odpowiedz na pytanie, w której kolejności Spring wywoła setter wstrzykujący zależność
 *  do pola konceptA.
 *  2.Odpowiedz na pytanie czy wstrzykiwanie przez settery jest dobrą praktyką?
 *
 * @author Kacper Staszek
 */
@Component
class KonceptB {

  private KonceptA konceptA;

  KonceptB(){
    System.out.println("Tworzę ziarno KonceptB");
  }

  void funkcjaB() {
    System.out.println("Siema z B!");
  }

  @Autowired
  public void setKonceptA(KonceptA konceptA) {
    this.konceptA = konceptA;
    System.out.println("wywołuję setter (set konceptA na KoncpetB)");
  }
}
