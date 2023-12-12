import java.util.Scanner;
public class intToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the integer number: ");
        int n = scan.nextInt();
        int indx = 0, num = n, zeroBits = 0; 
        int bin[] = new int[32];

        while (n>0) {
            if (n%2==0) {
                zeroBits ++ ;
            }
            bin[indx++] = n%2;
            n/=2;
        }
        System.out.print("Binary representation of "+num+" is: ");
        for (int i=indx-1; i>=0; i--) {
            System.out.print(bin[i]+"");
        }
        System.out.println();
        System.out.println("Number of zero bits: " + zeroBits);
        scan.close();
    }
    
}
