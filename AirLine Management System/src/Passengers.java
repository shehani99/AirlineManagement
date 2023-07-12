import java.util.Scanner;

public class Passengers {
    public static String name;
    public static String nationality;
    public static String gender;
    public static String passportNumber;
    public String address;
    public int phoneNumber;

    public Passengers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 for Enter Passenger Details, 2 for Back. ");
        int num = scanner.nextInt();
        if (num == 1) {
            passengerForm();
        } else {
            mainform mainform = new mainform();
        }
    }

    private void passengerForm() {

        System.out.println("\n*** Passenger Information Form ***\n");
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter name: ");
            name = input.nextLine();

            System.out.print("Enter nationality: ");
            nationality = input.nextLine();

            System.out.print("Enter gender: (M: for male and F: for female)");
            gender = input.nextLine();

            System.out.print("Enter passport number: ");
            passportNumber = input.nextLine();

            System.out.print("Enter address: ");
            address = input.nextLine();

            System.out.print("Enter phone number: ");
            phoneNumber = input.nextInt();

            System.out.println("* Passenger information saved! *");

            Passengers passenger = new Passengers();
            passenger.save();
            passenger.back();


            this.name = name;
            this.nationality = nationality;
            this.gender = gender;
            this.passportNumber = passportNumber;
            this.address = address;
            this.phoneNumber = phoneNumber;
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
            mainform mainform = new mainform();
        } finally {
            input.close();
        }

    }

    // Getter and setter methods for each field
    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getNationality() {
        return nationality;
    }

    public void getNationality(String nationality) {
        this.nationality = nationality;
    }

    public static String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static String getPassportNumber()
    {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Method to save the flight details
    public void save() {
        // Code to save the flight details
        System.out.println("Passenger's details saved.");
    }

    // Method to go back to previous screen
    public void back() {
        // Code to go back to previous screen
        System.out.println("Going back to previous screen.");
        mainform mainform = new mainform();

    }
}