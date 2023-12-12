import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String play = scan.nextLine();

        if (play.equals("yes")) {
            System.out.println("Great! \n rock - paper - scissors, shoot!");
            String yourChoise = scan.nextLine();
            String computerChoise = computerChoice();
            String result = result(yourChoise, computerChoise);
            printResult(yourChoise, computerChoise, result);

        } else {
            System.out.println("Darn, some other time...");
        }
        scan.close();
        
    }


    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     */
    public static String computerChoice() {
        double randomNumber = Math.random() * 3;
        int num = (int) randomNumber;
        
        switch (num) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "";
        }
    }

    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 
     */

    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            result = "You won :)";
        }
        else if (yourChoice.equals("rock") && computerChoice.equals("paper")) {
            result = "You lose :(";
        }
        else if (yourChoice.equals("paper") && computerChoice.equals("scissors")) {
            result = "You lose :(";
        }
        else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "You won :)";
        }
        else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You won :)";
        }
        else if (yourChoice.equals("scissors") && computerChoice.equals("rock")) {
            result = "You lose :(";
        }
        else if (yourChoice.equals(computerChoice)) {
            result = "It's Tie!";
        } else {
            result = "INVALID CHOICE";
            System.exit(0);
        }

        return result;
      }
 
    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     */
    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("You chose: " + yourChoice + "\nComputer chose: " + computerChoice);
        System.out.println(result);
    }

}
