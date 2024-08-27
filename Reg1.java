import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1{
// Prepare a Regex for Email Validation
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

        public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String testEmail = "test@example.com";

        if (isValidEmail(testEmail)) {
            System.out.println(testEmail + " is a valid email address.");
        } else {
            System.out.println(testEmail + " is not a valid email address.");
        }
    }


}
