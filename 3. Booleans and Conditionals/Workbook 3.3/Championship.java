import java.util.Scanner;

public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of points by which gryffindor scored over ravenclaw:");
        int margin = scan.nextInt();

        if ((gryffindor - ravenclaw + margin) > 300) {
            System.out.println("Gryffindor Win the Championship");
        } 
        else if ((gryffindor - ravenclaw + margin) >= 0) {
            System.out.println("Gryffindor got the second position");
        }
        else if ((gryffindor - ravenclaw + margin) > -100) {
            System.out.println("Gryffindor got the third position");
        } else {
            System.out.println("Gryffindor got the fourth position");
        }
        scan.close();
        
    }
}
