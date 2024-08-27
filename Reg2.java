
// Prepare a Regex to Find if a string contains the word "Java".
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Reg2 {

    // Prepare a Regex to find if a string contains the word "Java"
     static final String JAVA_REGEX = "\\bJava\\b";

    public static boolean containsJava(String input) {
        Pattern pattern = Pattern.compile(JAVA_REGEX);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    public static void main(String[] args) {
        // Test cases
        String input = "I love Java programing";
            System.out.println("\"" + input + "\": " + containsJava(input));
        }
    }

