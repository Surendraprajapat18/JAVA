import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = new double[celsius.length];

        for (int i=0; i<celsius.length; i++) {
            fahrenheit[i] = (celsius[i]/5 * 9) + 32 ;
        }
        
        System.out.println("\ncelsius: " + Arrays.toString(celsius));
        System.out.println("fahrenheit: " + Arrays.toString(fahrenheit));
    }

}
