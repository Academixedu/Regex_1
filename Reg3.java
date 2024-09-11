import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Extract all the digits from a string.
public static void main(String[] args) {
    digits();
}
public static void digits(){
    String pattern = "\\d+";
    String text="ip address is 198.162.280.9";
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(text);
    System.out.println("Digits");
    while (m.find()) {  
        System.out.println(m.group());  
    }
    System.out.println();

}
}

