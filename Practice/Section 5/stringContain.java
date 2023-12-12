import java.util.Scanner;

public class stringContain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String a = scan.nextLine().trim();
        System.out.println("Enter second string: ");
        String b = scan.nextLine().trim();

        int index = b.indexOf(a);
        System.out.print("If the second string contains the first one: ");

        if (index==-1) {
            System.out.print("False");
        } else {
            System.out.print("True");
        }
        scan.close();
    }
    
}
