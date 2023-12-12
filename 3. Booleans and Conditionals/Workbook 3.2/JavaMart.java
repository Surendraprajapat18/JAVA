public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;

        double toyCar = 5.99;
        System.out.println("\nCan I get this car?");
        
        if (wallet>=toyCar) {
            System.out.println("Sure! pay for the car");
        } else {
            System.out.println("Sorry, I only have" + wallet + " left.");
        }
        //if you have enough money
            //       print: Sure!
            //       pay for the toy car 

        //else:  Sorry, I only have <wallet> left.

        
        double nike = 95.99;
        System.out.println("\nCan I get these nike shoes?");
        //if you have enough money
            //       print: Sure!
            //       pay for the nike shoes 

        //else: Sorry, I only have <wallet> left.
        if (wallet>=nike) {
            System.out.println("Sure! pay for the nike shoes");
        } else {
            System.out.println("Sorry, I only have" + wallet + " left.");
        }

    }
}
