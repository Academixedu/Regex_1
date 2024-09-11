package Regex_1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2
{
    public static void main(String[] args) {
        String text = "I love programming in .";
        Pattern pattern = Pattern.compile("\\bJava\\b");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Found Java in the text.");
        } else {
            System.out.println("Did not find Java in the text.");
        }
    }

}