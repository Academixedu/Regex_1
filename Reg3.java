import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Reg3 {


    private static final String DIGIT_REGEX = "\\d+";
    private static final Pattern DIGIT_PATTERN = Pattern.compile(DIGIT_REGEX);

    public static String extractDigits(String input) {
        if (input == null) {
            return "";
        }
        
        Matcher matcher = DIGIT_PATTERN.matcher(input);
        StringBuilder digits = new StringBuilder();
        
        while (matcher.find()) {
            digits.append(matcher.group());
        }
        
        return digits.toString();
    }

    public static void main(String[] args) {
       
        String[] testStrings = {
            "My phone number is 123-456-7890.",
            "Order number: 2023-0098-457.",
            "There are 300 apples and 150 oranges.",
            "No digits here!",
            "Building #42, Room 101."
        };

        for (String str : testStrings) {
            System.out.println("Original: \"" + str + "\"");
            System.out.println("Extracted Digits: \"" + extractDigits(str) + "\"");
            System.out.println();
        }
    }
}
