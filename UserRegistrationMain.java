import java.util.Scanner;
public class UserRegistrationMain {
    public static void main(String args[])
    {
        System.out.println("Welcome to User Registration Problem");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scanner.next();
        scanner.close();

        // UC1 Check first name
        UserRegistration obj1 = new UserRegistration();
        obj1.checkFirstName(firstName);
    }
}
