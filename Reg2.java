import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2 {
    // Prepare a Regex to Find if a string contains the word "Java".
    public static void literalExample(String pattern) {
        System.out.println(" Match the data:");
        String text = "The Java based concepts.";
        
        Pattern k1 = Pattern.compile(pattern);
        Matcher s = k1.matcher(text);
        
        while (s.find()) {
            System.out.println("Found '" + s.group() + "' at index " + s.start());
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Reg2 k = new Reg2();
        k.literalExample("Java"); 
    }
}
