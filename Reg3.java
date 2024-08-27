
    // Extract all the digits from a string.

    import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Reg3 {

    // Prepare a Regex to extract all digits from a string
      static String DIGIT_REGEX = "\\d";

    public static String extractDigits(String input) {
        StringBuilder digits = new StringBuilder();
        Pattern pattern = Pattern.compile(DIGIT_REGEX);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            digits.append(matcher.group());
        }

        return digits.toString();
    }

    public static void main(String[] args) {
        // Test cases
        String input="Ga7 342nesh, 35hjvjj";
            System.out.println("\"" + input + "\": " + extractDigits(input));
        
    }
}

    