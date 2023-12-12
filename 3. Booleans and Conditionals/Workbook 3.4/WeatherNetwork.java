import java.util.Scanner;

public class WeatherNetwork {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the temprature:");
        int temp = scan.nextInt();  

        //IF - ELSE IF - ELSE STATEMENTS HERE!
        if (temp <= -1) {
            System.out.println("The forecast is FREEZING! Stay home!");
        }
        else if (temp <= 10) {
            System.out.println("The forecast is Chilly. Wear a coat!");
        } else {
            System.out.println("It's warm. Go outside!");
        }
        scan.close();

    }
}
