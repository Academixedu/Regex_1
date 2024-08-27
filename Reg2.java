
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2 {
    // Prepare a Regex to Find if a string contains the word "Java".
    public static void main(String[] args) {
        String str = "This is a Java.Java is a  popular language";
        String regex = "Java";
        Pattern p= Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println("Found:" + m.group() + " at index " + m.start());
        }
        System.out.println();

    }
}


