import java.util.Scanner;

public class equal {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();
        int fourthNumber = scan.nextInt();

        if (firstNumber==secondNumber && secondNumber==thirdNumber && thirdNumber==fourthNumber) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
        scan.close();
    }
}
