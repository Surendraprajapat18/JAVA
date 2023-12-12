import java.util.Scanner;

public class WorkSchedule {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of the day");
        int day = scan.nextInt();   //3rd day of the week...
        System.out.println("Enter True if on that day is holiday ");
        boolean holiday = scan.nextBoolean();
         
        // IF - ELSE IF - ELSE HERE!
        if (day != 6 && day!=7 && holiday) {
            System.out.println("Woohoo, no work :)");
        }
        else if (day != 6 && day!=7) {
            System.out.println("Wake up at 7:00 :(");
        } else {
            System.out.println("It's the weekend, no work!");
        }
        scan.close();
        
        }

    }
