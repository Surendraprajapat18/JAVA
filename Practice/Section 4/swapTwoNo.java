import java.util.Scanner;
public class swapTwoNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = scan.nextInt();
        System.out.print("Enter the second number: ");
        int second = scan.nextInt();

        System.out.println("Before swapping first number: "+first+" second number: "+second);
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println("After swapping first number: "+first+" second number: "+second);
        scan.close();
    }
}
