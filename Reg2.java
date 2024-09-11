import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Reg2 {

    
    private static final String JAVA_REGEX = "\\bJava\\b";
    private static final Pattern JAVA_PATTERN = Pattern.compile(JAVA_REGEX);

    
    public static boolean containsJava(String input) {
        if (input == null) {
            return false;
        }
        Matcher matcher = JAVA_PATTERN.matcher(input);
        return matcher.find();
    }

    public static void main(String[] args) {
       
        String[] testStrings = {
            "I love Java programming.",
            "Javascript is also a popular language.",
            "Java is versatile.",
            "Let's have some coffee.",
            "Welcome to the Java world!"
        };

        for (String str : testStrings) {
            System.out.println("\"" + str + "\" contains 'Java': " + containsJava(str));
        }
    }
}
