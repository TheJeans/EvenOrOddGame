import java.util.Random;
import java.util.Scanner;

public class EvenOrOdd {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        // INTRO
        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("Hi "+name);
        System.out.println("Do you want to play?");
        String ans = input.next();

        // PLAY GAME
        // If they type yes then the game starts
        if(ans.equalsIgnoreCase("yes")){
            playGame();
        } else {
            System.out.println("See you later!");
        }
    }

    public static void playGame() {
        Scanner input = new Scanner(System.in);

        // SELECTS ODD OR EVEN
        System.out.println("Let's play a game called \"Odds or Evens\" ");
        System.out.println("Do you want to choose Odd or Evens? \nO for Odd and E for Even ");
        String x = input.next();

        if  (x.equalsIgnoreCase("o")) {
            System.out.println("Cool! You picked odds. The computer will be evens.");
        } else {
            System.out.println("Cool! You picked evens. The computer will be odds. ");
        }
        System.out.println("--------------------------------------------------------");

        // GAME PORTION STARTS
        System.out.println("How many “fingers” do you put out?");
        int fingers =input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The PC plays "+computer+" fingers");
        System.out.println("---------------------------------------------------------");
        int sum=fingers+computer;

        // RESULT
        boolean res=sum%2==0;
        System.out.println(fingers+" + "+computer+" = "+sum);
        if (res){
            System.out.println(sum+" is ... Even!");
        }else{
            System.out.println(sum+" is ... Odd!");
        }

        // ANNOUNCE WINNER
        if (((res)&&(x.equalsIgnoreCase("e")))||((!res)&&(x.equalsIgnoreCase("o")))){
            System.out.println("You Win!");
        }
        else
            System.out.println("You loose. Better luck next time.");
        System.out.println("----------------------------------------------------------");
    }
}