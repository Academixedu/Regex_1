import java.util.regex.*;
import java.util.*;
public class Reg1{
// Prepare a Regex for Email Validation


    public static void main(String[] args) {
        String pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern compiledPattern = Pattern.compile(pattern);

        List<String> emails = Arrays.asList(
            "user.name@example.co.uk",
            "user+name@example.travel",
            "user@sub.example.com",
            "user@.example.com",      
            "user@exam_ple.com"       
        );

        for (String email : emails) {
            Matcher matcher = compiledPattern.matcher(email);
            if (matcher.matches()) {
                System.out.println("Valid: " + email);
            } else {
                System.out.println("Invalid: " + email);
            }
        }
    }
}