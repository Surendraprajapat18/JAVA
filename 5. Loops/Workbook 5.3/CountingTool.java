import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int range = scan.nextInt();
        for (int i=0; i<=range; i++) {
            System.out.print(i + " ");
        }

        scan.close();
    }
}
