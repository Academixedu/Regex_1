import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Extract all the digits from a string.
public static void extractDigits(String input) {
    String digitPattern = "\\d+";
      Pattern pattern = Pattern.compile(digitPattern);
       Matcher matcher = pattern.matcher(input);
       while (matcher.find()) {
        System.out.println("Found digits: " + matcher.group() + " at index " + matcher.start());
    }
}
    public static void main(String[] args) {
        String inputText = "1two3four5six7eight9ten";

extractDigits(inputText);
}
}
