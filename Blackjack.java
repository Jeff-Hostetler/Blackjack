public class Blackjack {

  public static void main (String [] args) {
    Bank bank = new Bank();
    bank.chips = 100;
    while(bank.chips > 0) {
      System.out.println("You have " + bank.chips + " chips");
      PlayHand hand = new PlayHand();
      hand.bet = 10;
      hand.play();
      if (hand.playerWins == true) {
        bank.winHand(hand.bet);
        System.out.println("You now have " + bank.chips + " chips");
      } else if (hand.playerWins == false) {
        bank.loseHand(hand.bet);
        System.out.println("You now have " + bank.chips + " chips");
      } else {
        System.out.println("You still have " + bank.chips + " chips");
      }
      System.out.println("****************************************************");
    }
  }
}
