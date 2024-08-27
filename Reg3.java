import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg3{
// Extract all the digits from a string.

    public static void main(String[] args) {
        String input = "hello  my name is fayaz here iam declaring number 1234576";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher m= pattern.matcher(input);

        while (m.find()) {
            System.out.println("Found digits: " + m.group());
        }
    }

}
