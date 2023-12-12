import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int end = scan.nextInt();

        for (int i=1; i<=end; i+=1) {
            if (i%2==0) {
                System.out.println(i + " - Even");
            } else {
                System.out.println(i + " - Odd");
            }
        }
        scan.close();
    }
}
