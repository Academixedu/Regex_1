import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1{
// Prepare a Regex for Email Validation
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.println("Enter your email address:");
        String email = s.nextLine();
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        if (m.matches()) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is not valid");
        }
    }
}