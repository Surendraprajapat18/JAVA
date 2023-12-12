import java.util.Scanner;
public class dimensionalChange {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        // Taking rows and columns as a input
        System.out.print("Enter the number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scan.nextInt();

        int[][] originalArray = new int[rows][columns];
        System.out.println("Enter the elements of the original array: ");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                originalArray[i][j] = scan.nextInt();
            }
        }
        System.out.println("Original Array: ");
        printArray(originalArray);

        int[][] modifiedArray = dimensionalChangeArray(originalArray);

        System.out.println("After changing the rows into columns and columns into rows: ");
        printArray(modifiedArray);

        scan.close();


    }

    // Changing the rows into columns and columns into rows
    public static int[][] dimensionalChangeArray(int[][] originalArray) {
        int rows = originalArray.length;
        int columns = originalArray[0].length;
        int[][] modifiedArray = new int[columns][rows];
        for (int i=0; i<columns; i++) {
            for (int j=0; j<rows; j++) {
                modifiedArray[i][j] = originalArray[j][i];
            }
        }

        return modifiedArray;
    }

    // printing two dimension array
    public static void printArray(int[][] array) {
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}