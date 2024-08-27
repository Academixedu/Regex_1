import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Reg1{
// Prepare a Regex for Email Validation
public static void EmailValidation(String email)
{
    System.out.println("Email validation");
    String pattern = "^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,6}$";
    Pattern k = Pattern.compile(pattern);
    Matcher s = k.matcher(email);
    
    if (s.matches()) {
        System.out.println("Valid email: " + email);
    } else {
        System.out.println("Invalid email: " + email);
    }
    System.out.println();

}
public static void main(String[] args) 
{
    Reg1 k1 = new Reg1();
    k1.EmailValidation("kavitha@gmail.com");
    
}
}





