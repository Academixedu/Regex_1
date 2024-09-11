import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Prepare a Regex to Find if a string contains the word "Java".
 public static void main(String[] args) {
        String sc = "Java";
        Scanner sc1 = new Scanner(System.in);
        String text = sc1.nextLine();

        Pattern p = Pattern.compile(sc);
        Matcher m = p.matcher(text);
        System.out.println(m.find());

    }
}
