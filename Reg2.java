// Prepare a Regex to Find if a string contains the word "Java".

import java.util.regex.*;

public class Reg2 {
    // Prepare a Regex to find if a string contains the word "Java"
    private static final String JAVA_REGEX = "\\bJava\\b"; // \b is a word boundary
    private static final Pattern pattern = Pattern.compile(JAVA_REGEX);

    // Method to check if the word "Java" is in the string
    public static boolean containsJava(String input) {
        if (input == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(input);
        return matcher.find();  // Returns true if "Java" is found anywhere in the string
    }

    public static void main(String[] args) {
        // Test the regex with some strings
        String[] testStrings = {
            "I love programming in Java!",
            "This sentence does not mention the keyword."
        };

        for (String test : testStrings) {
            if (containsJava(test)) {
                System.out.println("\"" + test + "\" contains the word Java.");
            } else {
                System.out.println("\"" + test + "\" does not contain the word Java.");
            }
        }
    }
}
