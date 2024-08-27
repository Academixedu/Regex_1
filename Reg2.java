import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Prepare a Regex to Find if a string contains the word "Java".
public static void contains() {
String pattern = "\\bjava\\b";
Pattern pat = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
    Matcher mat = pat.matcher("Copper Java, Java is simple but powerful, javascript is for frontend.");
        while (mat.find()) {
            System.out.println("Found '" + mat.group() + "' at index " + mat.start());
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Reg2 rex = new Reg2();
        rex.contains();
    }


}
