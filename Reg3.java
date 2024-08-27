
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3 {
// Extract all the digits from a string.
    public static void main(String[] args) {
        String str = "Sujatha94karri701";
        String regex = "\\d"; 
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println("Found digit '" + m.group() + "' at index " + m.start());
        }
    }
}

