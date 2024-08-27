import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Prepare a Regex to Find if a string contains the word "Java".
 public static void main(String args[]) {
        System.out.println("Literal Matching:");
        String pattern = "Java";
        String text = "//+5Javay*5/";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println("Found '" + m.group() + "' at index " + m.start());
        }
    }
}
