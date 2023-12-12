import java.util.Scanner;

public class Doubles {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nDice 1 - ");
        int dice1 = scan.nextInt();
        System.out.print("Dice 2 - ");
        int dice2 = scan.nextInt();

        while (dice1 != dice2) {
            System.out.print("\nDice 1 - ");
            dice1 = scan.nextInt();
            System.out.print("Dice 2 - ");
            dice2 = scan.nextInt();
        }

        System.out.println("\nYou rolled doubles!");
        scan.close();
    }

}





