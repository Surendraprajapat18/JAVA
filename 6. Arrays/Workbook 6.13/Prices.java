import java.util.Arrays;

public class Prices {
    public static void main(String[] args) {
        
        double[][] prices = {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
        };

        System.out.println("\nBanking: " + Arrays.toString(prices[0]));
        System.out.println("Beverage: " + Arrays.toString(prices[1]));
        System.out.println("Cereals: " + Arrays.toString(prices[2]));
    }
}
