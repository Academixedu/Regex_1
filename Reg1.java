import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1{
// Prepare a Regex for Email Validation
public static void main(String args[]){

        String pattern = "^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,6}$";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your email");
        String email=s.nextLine();
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        
        if (m.matches()) {
            System.out.println("Valid email: " + email);
        } else {
            System.out.println("Invalid email: " + email);
        }
        System.out.println();
    }

}