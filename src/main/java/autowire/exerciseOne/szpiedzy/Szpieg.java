package autowire.exerciseOne.szpiedzy;

import autowire.exerciseOne.drinki.Drink;
import autowire.exerciseOne.złoczyńcy.Złoczyńca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 */

public class Szpieg {

  String imię;
  String nazwisko;
  Drink drink;
  Złoczyńca złoczyńca;


  public Szpieg(Złoczyńca złoczyńca, Drink drink, String imię, String nazwisko) {
    this.złoczyńca = złoczyńca;
    this.drink = drink;
    this.imię = imię;
    this.nazwisko = nazwisko;
  }
  public void przedstawSię(){
    System.out.printf("Jestem %s, %s %s %n", nazwisko, imię, nazwisko);
  }

  public void zamówDrinka(){
    System.out.printf("Poproszę %s, %s%n", drink.getNazwa(),drink.przepis());
  }

  public void mójWróg(){
    System.out.printf("Moim wrogiem jest %s%n",złoczyńca);
  }
}
