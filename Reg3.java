import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Reg3{
// Extract all the digits from a string.
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String p = "\\d";
        Pattern pattern = Pattern.compile(p);
        Matcher m = pattern.matcher(str);
        while (m.find()) {
            System.out.println(m.group() + ":" + m.start());
        }
    }
}
