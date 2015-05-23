public class Bank {
  int chips;

  void loseHand (int bet) {
    chips = chips - bet;
  }

  void winHand (int bet) {
    chips = chips + bet;
  }
}
