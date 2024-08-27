import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3 {
    // Extract all the digits from a string.
    public static void extractDigits(String input) {
        System.out.println("Extracting Digits:");
        String pattern = "\\d+";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        
        while (m.find()) {
            System.out.println("Found digits: " + m.group());
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        String testString = "My number is 123456";
        extractDigits(testString);
    }
}


