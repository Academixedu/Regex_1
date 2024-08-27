import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Extract all the digits from a string.
 public static void main(String[] args) {
        String input = "My order number is 12345 and my zip code is 67890.";
        String pattern = "\\d+";  

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(input);

        System.out.println("Digits found in the string:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
