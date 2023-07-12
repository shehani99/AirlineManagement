import java.util.Scanner;

public class mainform {
    private Scanner scanner;
    private String passportNumber;
    private String name;
    private String gender;
    private String nationality;

    public mainform() {
        scanner = new Scanner(System.in);
        Splash splash = new Splash();
        displayMenu();
    }

    private void displayMenu() {

        System.out.println("\nHOME\n");

        System.out.println("1. Flight");
        System.out.println("2. Passengers");
        System.out.println("3. Ticket Booking");
        System.out.println("4. Ticket Cancellation");
        System.out.println("0. Exit");

        System.out.println("\nChoose an option:");

        int choice;

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Flight flight = new Flight();
                    String flightCode = flight.getFlightCode();
                    break;
                case 2:
                    Passengers passengers = new Passengers();
                    break;
                case 3:
                    TicketBooking ticketBooking = new TicketBooking();
                    break;
                case 4:
                    TicketCancellation ticketCancellation = new TicketCancellation();
                    break;
                case 0:
                    System.out.println("Thank you for using TURBO AIRLINE!");
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    mainform mainform = new mainform();
                    break;
            }

    }
}
