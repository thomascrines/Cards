package cards;

public class Card {

  private RankType rank;
  private SuitType suit;

  public Card(RankType rank, SuitType suit) {
    this.rank = rank;
    this.suit = suit;
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
   
}