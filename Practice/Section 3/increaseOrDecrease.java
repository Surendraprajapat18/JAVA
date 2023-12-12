import java.util.Scanner;

public class increaseOrDecrease {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNumber = scan.nextInt();

        if (firstNumber<secondNumber && secondNumber<thirdNumber) {
            System.out.println("\nIncreasing Order");
        } 
        else if (firstNumber>secondNumber && secondNumber>thirdNumber) {
            System.out.println("\nDecreasing Order");
        } else {
            System.out.println("\nNeither Increasing or Decreasing Order");
        }
        scan.close();
    }
}
