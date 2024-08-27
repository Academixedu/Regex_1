import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Prepare a Regex to Find if a string contains the word "Java".
 public static void main(String[] args) {
        String string_java_partten = "^[a-zA-Z]\\bJava\\b[a-zA-Z]$";
        Pattern pattern = Pattern.compile(string_java_partten);
        Matcher matcher = pattern.matcher("I am learning Java at AcademiXedu.");

        if (matcher.matches()) {
            System.out.println("java matched");
        } else {
            System.out.println("java not matched");
        }
    }}
