
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Prepare a Regex to Find if a string contains the word "Java".
public static void contains(){
    String pattern = "java";
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher("this is the java regex concept");
    while(m.find())
    {
        System.out.println("Found "+m.group()+" at index "+m.start());
    }
    System.out.println(" ");
}
public static void main(String[] args) {
    Reg2 r = new Reg2();
    r.contains();
}
}