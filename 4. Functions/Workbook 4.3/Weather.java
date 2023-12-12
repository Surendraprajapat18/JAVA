public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight); 
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double calsius = ((fahrenheit - 32) * 5/9);
        return calsius;
    }
     
    public static void printTemperatures(double fahrenheit) {
        System.out.println("\nF: " + fahrenheit + "\nC: " + fahrenheitToCelsius(fahrenheit));
    }

}