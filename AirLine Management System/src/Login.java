import java.util.Scanner;

abstract public class Login {
    private static final String USERNAME = "Admin";
    private static final String PASSWORD = "12345";

    public static void main(String[] args) {
        Splash splash = new Splash();
        splash.main(new String[0]);
        Scanner scanner = new Scanner(System.in);

        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            User user = new User(username, password);
            Authenticator authenticator = new Authenticator();
            if (authenticator.authenticateUser(user)) {
                System.out.println("Access granted.");
                System.out.println("\nWELCOME " + user.getUsername() + "!");
                mainform mainform = new mainform();
                loggedIn = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
    }
}

class User extends Login {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class Authenticator extends Login{
    private static final String USERNAME = "Admin";
    private static final String PASSWORD = "12345";

    public boolean authenticateUser(User user) {
        return user.getUsername().equals(USERNAME) && user.getPassword().equals(PASSWORD);
    }
}