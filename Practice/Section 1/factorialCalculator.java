import java.util.Scanner;

public class factorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer to find its factorial: ");
        int number = scanner.nextInt();

        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);

        scanner.close();
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
