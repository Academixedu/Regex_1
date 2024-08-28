package Regex_1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3
{
// Extract all the digits from a string.
public static void main(String[] args) {
        String inputString = "This is a string with 123 numbers 456 and 789.";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(inputString);
        while (matcher.find()) {
            String digit = matcher.group();
            System.out.println(digit);
        }
    }
}