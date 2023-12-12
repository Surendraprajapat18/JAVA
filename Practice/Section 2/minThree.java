import java.util.Arrays;
import java.util.Scanner;

public class minThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter the element of array: ");
        int[] array = new int[size];

        for (int i=0; i<size; i++) {
            array[i] = scan.nextInt();
        }

        smallestThree(array);
        scan.close();
    }

    public static void smallestThree(int[] array) {
        Arrays.sort(array);

        System.out.print("Original Array: " + Arrays.toString(array));
        System.out.print("\n3 Smallest elements is: ");
        for (int i=0; i<3; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
