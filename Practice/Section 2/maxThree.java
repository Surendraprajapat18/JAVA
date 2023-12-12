import java.util.Arrays;
import java.util.Scanner;

public class maxThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter the element of array: ");
        int[] array = new int[size];

        for (int i=0; i<size; i++) {
            array[i] = scan.nextInt();
        }

        largestThree(array);
        scan.close();
    }

    public static void largestThree(int[] array) {
        Arrays.sort(array);

        System.out.print("Original Array: " + Arrays.toString(array));
        System.out.print("\n3 Largest elements is: ");
        for (int i=array.length - 1; i>=array.length-3; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
