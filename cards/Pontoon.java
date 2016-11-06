package cards;
import cards.*;
import java.util.*;

public class Pontoon {

  private ArrayList<Player> players = new ArrayList<Player>();
  private static ArrayList<Card> deck = new ArrayList<Card>();
  private static ArrayList<Card> hand = new ArrayList<Card>();


  // public Pontoon setUpDeck(){
  //   this.deck.buildDeck();
  //   this.deck.shuffle();
  // }

  public void addPlayer(Player player){
    players.add(player);
  }

  public int playerCount(){
    return players.size();
  }

  public ArrayList<Player> getPlayers() {
    return this.players;
  }

  public Player returnPlayer() {
    if(playerCount() > 0) {
      return players.remove(0);
    }
    return null;
  }

  public void deal(){
    for (Player player : this.players){
      player.makeHand(deck.get(0), deck.get(1));
      deck.remove(0);
      deck.remove(0);
    } 
  }

}