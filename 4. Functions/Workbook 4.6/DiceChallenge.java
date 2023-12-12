import java.util.Scanner;

public class DiceChallenge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter 3 number between 1 and 6:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (isLessthan1(num1, num2, num3) || isHigherthan6(num1, num2, num3)) {
            System.out.println("\nYou don't enter the number between 1 to 6");
            System.exit(0);
        } 

        int diceRollSum = roll1 + roll2 + roll3;
        int userDiceRollSum = num1 + num2 + num3;
        System.out.println("\nYour sum: " + userDiceRollSum + " Computer sum: " + diceRollSum);

        if (isUserWin(diceRollSum, userDiceRollSum)) {
            System.out.println("\nCongratulation, You won :)");
        } else {
            System.out.println("\nBetter luck next time :(");
        }

        scan.close();
       
    }

    public static boolean isLessthan1(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    public static boolean isHigherthan6(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    public static boolean isUserWin(int diceRollSum, int userDiceRollSum) {
        return (userDiceRollSum > diceRollSum && (userDiceRollSum - diceRollSum) > 3);
    }

    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;
    }
}
