import java.util.Arrays;

public class LotteryTickets {
    public static void main(String[] args) {
        
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);

        System.out.println("\nTicket 1 numbers: " + Arrays.toString(ticket));
        ticket2[2] = 54;
        System.out.println("Ticket 2 numbers: " + Arrays.toString(ticket2));
    } 
    
}

