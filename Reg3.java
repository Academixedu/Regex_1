import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Extract all the digits from a string.
    public static void main(String args[]){
         String input = "java123script456prog7.8%9";

        
        String pattern = "\\d+";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);

        System.out.println("Extracted digits:");

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
    

