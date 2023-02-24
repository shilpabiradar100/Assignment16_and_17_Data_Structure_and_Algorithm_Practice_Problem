
import java.util.regex.Pattern;
public class UserRegistration {
    /**
     * Method to check given first name is valid or not
     * with minimum characters 3 and ensure first letter is captial
     */
    public void checkFirstName(String name)
    {
        boolean isMatched = Pattern.compile("(^([A-Z]{1})[a-z]{2,})+").matcher(name).matches();
        if(isMatched)
        {
            System.out.println("It is valid name");
        }
        else
        {
            System.out.println("It is not a valid name");
        }
    }
}
