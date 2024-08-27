import java.util.regex.*;

public class Reg1 {
    public static void main(String[] args) {
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher("test@example.com");

        if (matcher.matches()) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
    }
}
