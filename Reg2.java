import java.util.regex.Pattern;

public class Reg2{
    // Prepare a Regex to Find if a string contains the word "Java".
    private static final String STRING_REGEX = ".*\\bJava\\b.*";
    private static final Pattern STRING_PATTERN = Pattern.compile(STRING_REGEX);

    public static void main(String[] args) {
        String string = "Java is a programming language";
        if(STRING_PATTERN.matcher(string).matches()){
            System.out.println("String contains the word Java");
        }else{
            System.out.println("String does not contain the word Java");
        }
    }
}
