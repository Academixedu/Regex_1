import java.util.regex.*;
import java.util.*;
public class Reg3{
// Extract all the digits from a string.


    public static void main(String[] args) {
        String string = "The year 2024 has some interesting events in 2023 and 2025.";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(string);
        List<String> digits = new ArrayList<>();
        
        while (matcher.find()) {
            digits.add(matcher.group());
        }
        
        System.out.println(digits);
    }
}

