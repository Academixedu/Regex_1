import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Extract all the digits from a string.
   public static void main(String[] args) {
           String pattarn ="\\d";
    String text ="My order number is 949356, and I need 2 more items.";

    Pattern p=Pattern.compile(pattarn);
    Matcher m=p.matcher(text);
    while(m.find())
     System.out.println(m.group() +" "+m.start()); 
    }
}


