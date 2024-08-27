
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Extract all the digits from a string.
public static void extract(){
    String pattern = "[0-9]";
    Pattern p = Pattern.compile(pattern);
    String text = "I am mani and my age is 21";
    Matcher m = p.matcher(text);
    while(m.find())
    {
        System.out.println("Digits are "+m.group()+ " Found at "+m.start());
    }
    System.out.println(" ");

}
public static void main(String[] args) {
    extract();
    
}
}
