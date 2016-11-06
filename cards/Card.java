package cards;

public class Card {

  private RankType rank;
  private SuitType suit;
  int value;

  public Card(RankType rank, SuitType suit, int value) {
    this.rank = rank;
    this.suit = suit;
    this.value = value;
  }

  public RankType getRank(){
    return this.rank;
  }

  public SuitType getSuit(){
    return this.suit;
  }

  public String nameAsString() {
    return this.rank.toString().toLowerCase() + " of " + this.suit.toString().toLowerCase();
  }

  public int returnValue() {
    return this.value;
  }
   
}