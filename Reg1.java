import java.util.regex.*;
import java.util.Scanner;
public class Reg1{
// Prepare a Regex for Email Validation

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Email: ");
    String email = in.nextLine();

    String regex = "^[a-zA-Z][a-zA-Z0-9]{0,18}[0-9]{0,2}@gmail\\.com$";
    
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(email);
    
    if(m.matches()) {
        System.out.println("Valid ");
    } else {
        System.out.println("Invalid Email");
    }}
    }
