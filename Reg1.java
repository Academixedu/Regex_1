// Prepare a Regex for Email Validation

import java.util.regex.*;

public class Reg1 {
    // Prepare a Regex for Email Validation
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);

    // Method to validate email
    public static boolean validateEmail(String email) {
        if (email == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Test the email validation
        String[] emails = {"test@example.com", "invalid-email", "john_doe@gmail.co", "user@domain"};

        for (String email : emails) {
            if (validateEmail(email)) {
                System.out.println(email + " is a valid email.");
            } else {
                System.out.println(email + " is an invalid email.");
            }
        }
    }
}
