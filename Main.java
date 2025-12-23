import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner myScan = new Scanner(System.in);
    final int maxTries = 3;
    
    int randNum = (int)(Math.random()*11);
    System.out.println("I'm thinking of a number between 0 and 10...");
    User usr1 = new User();
    
    while (usr1.getNumTries() < maxTries){
      System.out.println("Enter your Guess: ");
      usr1.setUsrNum(myScan.nextInt());
      int user = usr1.getUsrNum();
      usr1.incrementTries();

      if (user > randNum){
        System.out.println("Too high. Please try again.");
      }

      else if (user < randNum){
        System.out.println("Too low. Please try again.");
      }

      else{
        System.out.println("Correct guess! Here's your number: " + randNum);
        break;
      }

    }

    myScan.close();
  }
}
