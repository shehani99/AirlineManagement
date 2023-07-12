import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketBooking {
    private int amount;

    public TicketBooking()  {

        super();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 for View and Save amount, 2 for Back. ");
        int num = scanner.nextInt();
        if(num==1) {
            viewDetails();
        }
        else {
            mainform mainform = new mainform();
        }
    }


    private void viewDetails() {

        // Code to view details
        System.out.println("Passenger Ticket Booking Information:\n");
        System.out.println("Name: " + Passengers.getName());
        System.out.println("Gender: " + Passengers.getGender());
        System.out.println("Passport Number: " + Passengers.getPassportNumber());
        System.out.println("Nationality: " + Passengers.getNationality());
        System.out.println("Flight Code: " + Flight.getFlightCode());


        // Use the getter method to retrieve the flight code value


        Scanner input = new Scanner(System.in);

        // Code to enter amount
        int amt = 0;
        try {
            // Code to enter amount
            System.out.print("Enter amount: ");
            amt = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            viewDetails();
            return;
        }

        this.amount = amt;
        System.out.println("Amount: " + amount);

        book();
        TicketBooking ticketBooking = new TicketBooking();
        TicketBooking.save();
        TicketBooking.back();
    }



    public void book() {
        // Code to book the ticket
        System.out.println("\n* Ticket booked! *\n");
    }
    public static void save() {
        // Code to save the flight details
        System.out.println("Ticket booked details saved.");
    }

    // Method to go back to previous screen
    public static void back() {
        // Code to go back to previous screen
        System.out.println("Going back to previous screen.");
        mainform mainform = new mainform();

    }

}