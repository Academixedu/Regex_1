import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
    // Extract all the digits from a string.
    public static void main(String[] args) {
        String string = "I have 2 apples and 3 pineapples";
        String regex = "\\d+";
        // Compile the regex and create a matcher
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
