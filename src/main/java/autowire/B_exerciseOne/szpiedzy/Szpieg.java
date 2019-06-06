package autowire.B_exerciseOne.szpiedzy;

import autowire.B_exerciseOne.drinki.Drink;
import autowire.B_exerciseOne.złoczyńcy.Złoczyńca;

/**
 * @author Jakub Czajka
 */

public class Szpieg {

  private String imię;
  private String nazwisko;
  private Drink drink;
  private Złoczyńca złoczyńca;


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
