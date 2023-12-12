import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2023 Cricket World Cup?");
        System.out.println("\ta) India\n\tb) Australia\n\tc) England\n\td) Pakistan\n");
        String answer1 = scan.nextLine();

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String answer2 = scan.nextLine();

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String answer3 = scan.nextLine();

        System.out.println("\n4. What is the capital of India?");
        System.out.println("\ta) Delhi\n\tb) New Delhi\n\tc) Jammu and Kashmir\n");
        String answer4 = scan.nextLine();

        int score = 0;

        if (answer1.equals("a")) {
            score += 5;
        }
        if (answer2.equals("a")) {
            score += 5;
        }
        if (answer3.equals("d")) {
            score += 5;
        }
        if (answer4.equals("b")) {
            score += 5;
        } 

        System.out.println("Your final score is: " + score + "/20");

        
        if (score >= 15) {
            System.out.println("Wow, you know your stuff!");
        }
        else if (score < 15 && score >= 5) {
            System.out.println("Not bad");
        } else {
            System.out.println("better luck next time.");
        }

        scan.close();
    }
}
