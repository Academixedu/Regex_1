import java.util.regex.*;
import java.util.*;
public class Reg2{
// Prepare a Regex to Find if a string contains the word "Java".


    public static void main(String[] args) {
        String text = "Order number: 12345. Your discount code is 6789. The total amount is $987.";
        
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        List<String> digits = new ArrayList<>();
        while (matcher.find()) {
            digits.add(matcher.group());
        }
        
        System.out.println(digits);
    }
}


