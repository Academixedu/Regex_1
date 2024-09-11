import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1{
// Prepare a Regex for Email Validation
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String pattern = sc.nextLine();
    String email = sc.nextLine();

    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(email);

    if(m.matches()){
        System.out.println(email+" is Valid");
    }
    else{
        System.out.println(email+" is Not Valid");
    }
}
}
