import java.util.Scanner;

public class TicketCancellation {
    private static String flightCode;
    public TicketCancellation(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 for Delete Record, 2 for Back. ");
        int num = scanner.nextInt();
        if (num == 1) {
            deleteDatails();
        }
        else {
            mainform mainform = new mainform();
        }
           
    }

    private void deleteDatails() {
        String removedPassenger;
        try {
            // Prompt the user for the name and passport number of the passenger to cancel
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter passenger name: ");
            String name = scanner.nextLine();
            System.out.print("Enter flight code: ");
            String flightcode = scanner.nextLine();

            if (Passengers.getName().equalsIgnoreCase(name) && Flight.getFlightCode().equalsIgnoreCase(flightcode)) {
                removedPassenger=name;
                System.out.println(name+" with Flight Code "+flightcode+" has been removed.\n");
                mainform mainform = new mainform();
            }
            else{
                System.out.println(name+" with flight code "+ flightcode+ " does not exist.\n");
                mainform mainform = new mainform();
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            mainform mainform = new mainform();
        }
    }
}