import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1{
// Prepare a Regex for Email Validation
public static boolean isValidEmail(String email) {
    String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    Pattern pattern = Pattern.compile(emailPattern);
    if (email == null) {
        return false;
    }
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
}
public static void main(String[] args) {
    String email1 = "example@example.com";
    String email2 = "invalid-email.com";

    System.out.println(email1 + " is valid: " + isValidEmail(email1));
    System.out.println(email2 + " is valid: " + isValidEmail(email2));
}
}