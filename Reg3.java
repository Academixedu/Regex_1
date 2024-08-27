import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg3{
// Extract all the digits from a string.
public static void main(String[] args) {
        String pattern = "\\d";
        String text = "1 is a bro of 2 and 3 is cousin of 89";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        
        while (m.find()) {
            System.out.println("Found '" + m.group() + "' at index " + m.start());
        }
        System.out.println();
    }
}

