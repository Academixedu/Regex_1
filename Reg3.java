import java.util.regex.*;
public class Reg3{
    public static void main(String[] args) {
        String text = "Hello123World456!";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

// Extract all the digits from a string.

