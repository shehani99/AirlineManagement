import java.util.Scanner;

public class Flight {
    private Scanner scanner;
    public static String flightCode;
    private String source;
    private String destination;
    private String takeoffDate;
    private int numberOfSeats;

    public Flight() {
        scanner = new Scanner(System.in);

        System.out.println("Press 1 for Enter Details, 2 for Back. ");
        int num = scanner.nextInt();
        if(num==1) {
            display();
        }
        else {
            mainform mainform = new mainform();
        }


    }

    private void display(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Flight Information Form ***");
        try {
            System.out.print("Enter flight code: ");
            flightCode = scanner.nextLine();

            System.out.print("Enter source: ");
            source = scanner.nextLine();

            System.out.print("Enter destination: ");
            destination = scanner.nextLine();

            System.out.print("Enter takeoff date and time (yyyy-MM-dd): ");
            String takeoffDateStr = scanner.nextLine();
            takeoffDate = new String(takeoffDateStr);

            System.out.print("Enter number of seats: ");
            numberOfSeats = scanner.nextInt();

            System.out.println("\n* Flight details saved. *\n");

            Flight flight = new Flight();
            flight.save();
            flight.back();

            this.flightCode = flightCode;
            this.source = source;
            this.destination = destination;
            this.takeoffDate = takeoffDate;
            this.numberOfSeats = numberOfSeats;
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
            mainform mainform = new mainform();
        } finally {
            scanner.close();
        }

    }

    // Getter and setter methods for each field


    public static String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTakeoffDate() {
        return takeoffDate;
    }

    public void setTakeoffDate(String takeoffDate) {
        this.takeoffDate = takeoffDate;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    // Method to save the flight details
    public void save() {
        try {
            // Code to save the flight details
            System.out.println("Flight details saved.");
        } catch (Exception e) {
            System.out.println("Error while saving flight details: " + e.getMessage());
        }
    }

    // Method to go back to previous screen
    public void back() {
        try {
            // Code to go back to previous screen
            System.out.println("Going back to previous screen.");
        } catch (Exception e) {
            System.out.println("Error while going back to previous screen: " + e.getMessage());
        }
    }

}