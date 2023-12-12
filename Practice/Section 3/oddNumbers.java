import java.util.Scanner;

public class oddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int size = scan.nextInt();

        System.out.print("The odd numbers are: ");
        for (int i=0; i<=size; i++) {
            if (i%2 == 1) {
                System.out.print(i + " ");
            }
        }
        scan.close();
    }
}
