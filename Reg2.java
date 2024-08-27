import java.util.regex.Matcher;
import java.util.regex.Pattern;

   public class Reg2{
// Prepare a Regex to Find if a string contains the word "Java".

          private static final String JAVA_REGEX = "\\bJava\\b";
    private static final Pattern JAVA_PATTERN = Pattern.compile(JAVA_REGEX);

    // Method to check if the string contains the word "Java"
    public static boolean containsJava(String text) {
        if (text == null) {
            return false;
        }
        Matcher matcher = JAVA_PATTERN.matcher(text);
        return matcher.find();
    }

    public static void main(String[] args) {
        String testString = "Java is a programing language";

        if (containsJava(testString)) {
            System.out.println("containing the word java");
        } else {
            System.out.println("Does not contain the word java");
        }
    }
}
