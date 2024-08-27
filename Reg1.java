import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Reg1{
// Prepare a Regex for Email Validation
//john.m.doe@businessname.com
//jd123@businessname.com
//john_doe@businessname.com
// firstname.lastname@businessname.com
//john_12.doe_12@acad.net

public static void emailValidation(String email){
    String pattern="(^//d([a-z0-9_]{1,15}\\.?){0,2}[a-z0-9_]{1,15})@[a-z]{1,12}\\.[a-z]{2,8}";
    Pattern p=Pattern.compile(pattern);
    Matcher m=p.matcher(email);
    if (m.matches()) {
        System.out.println("Valid email: " + email);
    } else {
        System.out.println("Invalid email: " + email);
    }
    System.out.println();
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter email");
    String email1=sc.nextLine();
    emailValidation(email1);
    sc.close();
}

}
