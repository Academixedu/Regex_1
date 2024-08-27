
// Prepare a Regex for Email Validation
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Reg1{


     static final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {

        String email = "pavaniburadakavi@gmail.com";
            System.out.println(email + ": " + isValidEmail(email));
        }
    }

