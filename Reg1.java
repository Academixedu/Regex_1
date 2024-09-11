import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Reg1{
// Prepare a Regex for Email Validation
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String p = "^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,6}$";
        Pattern pattern = Pattern.compile(p);
        Matcher m = pattern.matcher(str);
        if (m.find())
            System.out.println("the email is valid:" + str);
        else
            System.out.println("the email is not vaild " + str);
    }
}
