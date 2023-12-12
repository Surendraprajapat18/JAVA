import java.util.Scanner;

public class averageOfThree {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();

        double mean = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Average of three numbers: " + mean);
        scan.close();
    }
}