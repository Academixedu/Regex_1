import java.util.regex.Pattern;

public class Reg1{
     public static void main(String[] args) {
        String email="example@test.com";
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + 
                    "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    System.out.println(email.matches(emailRegex) ? "Valid" : "Invalid");
     }

    
// Prepare a Regex for Email Validation
}
