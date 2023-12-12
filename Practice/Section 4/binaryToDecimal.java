import java.util.Scanner;
public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number in binary form : ");

        int binary=scan.nextInt();
        int decimal=0,p=0,k=binary;

        while(binary>0){
            if(binary%2==1) {
                decimal+=Math.pow(2,p);
                p++;
                binary/=10;
            }
        }
        System.out.print("Decimal form of " + k + " : " + decimal);
        scan.close();
    }
}
