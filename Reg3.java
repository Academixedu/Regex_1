import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Extract all the digits from a string.

 public static void main(String args[]) {
        System.out.println("Extracting Digits:");
        String pattern = "\\d+";
        String text = "//+5Ja64y*5/";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println("Found '" + m.group() + "' at index " + m.start());
        }
    }
}
