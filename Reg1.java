import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Reg1 {
    
    // Prepare a Regex for Email Validation
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    // Method to validate email
    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
     
        String[] testEmails = {"test@example.com", "user@domain.co.in", "user.name+tag+sorting@example.com", "invalid-email@", "another.invalid-email.com"};
        
        for (String email : testEmails) {
            System.out.println(email + " : " + isValidEmail(email));
        }
    }
}
