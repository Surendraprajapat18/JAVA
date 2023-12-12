import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        System.out.println("Enter the element of array: ");
        int[] array = new int[size];

        for (int i=0; i<size; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(array));

        Arrays.sort(array);
        System.out.print("Sorted Array: " + Arrays.toString(array));
        scan.close();
    }   
}
