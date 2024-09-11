import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1{
    // Prepare a Regex for Email Validation
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String email1 = "example@example.com";
        System.out.println(email1 + " Is valid email: " + isValidEmail(email1));

        String email2 = "example";
        System.out.println(email2 + " Is valid email: " + isValidEmail(email2));
    }
}
