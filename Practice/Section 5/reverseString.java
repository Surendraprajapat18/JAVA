import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = scan.nextLine();
        String words[] =s.split(" ", 0);
        System.out.print("After reversing string: ");

        for (int i=words.length-1; i>=0; i--) {
            System.out.print(words[i] + " ");
        }
        scan.close();
    }
}
