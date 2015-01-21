import java.util.Random;
import java.util.Scanner;

public class Blackjack{

  public static void main (String [] args) {
    int array [] = {2,3,4,5,6,7,8,9,10,10,10,10,11};
    Random r = new Random();
    int card1 = array[r.nextInt(array.length)];
    int card2 = array[r.nextInt(array.length)];
    int yourHand = card1 + card2;
    int dealerCard1 = array[r.nextInt(array.length)];
    int dealerCard2 = array[r.nextInt(array.length)];
    int dealerHand = dealerCard1 + dealerCard2;
    System.out.println("you have " + yourHand);
    System.out.println("dealer is showing a  " + dealerCard2);

    if ((yourHand == 21) && (dealerHand != 21)){
      System.out.println("Blackjack!!");
      System.out.println("You win");
    } else{
      while (yourHand < 21){
        Scanner user_input = new Scanner( System.in );
        System.out.println("Do you want to hit?(yes/no)");
        String answer;
        answer = user_input.next();
        if (answer.equals("yes")){
          int newCard = array[r.nextInt(array.length)];
          System.out.println("You hit and got a " + newCard);
          yourHand += newCard;
          System.out.println("You now have " + yourHand);
        } else{
          break;
        }
      }

      if (yourHand < 22 ){
        System.out.println("Dealer shows both cards and has " + dealerHand + " total");
        while (dealerHand<17){
          System.out.println("The dealer will now hit");
          int dealerNewCard = array[r.nextInt(array.length)];
          System.out.println("Dealer hit and got a " + dealerNewCard);
          dealerHand += dealerNewCard;
          System.out.println("Dealer now has " + dealerHand);
          System.out.println("");
        }
      }

      if(yourHand > 21){
        System.out.println("Sorry, you have " + yourHand + ", you bust!");
      }else if (dealerHand > 21){
        System.out.println("The dealer bust, you win!");
      }else if ( (yourHand > dealerHand) && (yourHand < 22)){
        System.out.println("You have " + yourHand+ ". The dealer has " + dealerHand);
        System.out.println("You win");
      }else if (yourHand == dealerHand){
        System.out.println("You push and live to see another day");
      }else{
        System.out.println("You have " + yourHand + ". The dealer has " + dealerHand);
        System.out.println("You lose");
      }
    }
  }
}
