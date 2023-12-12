public class RandomNumbers {
    public static void main(String[] args) {
        
        int[][] randomArray = new int[100][10];
        for (int i = 0; i<randomArray.length; i++) {
            for (int j = 0; j<randomArray[i].length; j++) {
                randomArray[i][j] = randomNumber();
            }
        }
        print2DArray(randomArray);
    }

    public static int randomNumber() {
        double randomNumber = Math.random()*100;
        return (int)randomNumber;
    }

    public static void print2DArray(int[][] Array) {
        for (int i = 0; i<Array.length; i++) {
            for (int j = 0; j<Array[i].length; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
