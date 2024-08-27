import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1{
// Prepare a Regex for Email Validation
    public static void email(String email) {
        
        String pattern = "^[\\w]+@[\\w.-]+\\.[A-Za-z]{2,6}$";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        
        if (m.matches()) {
            System.out.println("Valid email: " + email);
        } else {
            System.out.println("Invalid email: " + email);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // email("syam@123gmail.com");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur email");
        String name=sc.nextLine();
        email(name);
    }
}
