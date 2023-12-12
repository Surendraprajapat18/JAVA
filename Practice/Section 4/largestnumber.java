import java.util.Scanner;
public class largestnumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int maxi= (a>b && a>c) ? a: (b>a && b>c) ? b : c;

        System.out.print("Maximum of three numbers is : " + maxi);
        scan.close();
    }
}
