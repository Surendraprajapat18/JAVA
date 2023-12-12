import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int size = scan.nextInt();

        for (int i=1; i<=size; i++) {
            for (int j=1; j<=size-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        scan.close();  
    }
}
