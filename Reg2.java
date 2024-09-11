import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Prepare a Regex to Find if a string contains the word "Java".
public static void main(String[]args){
     word();
}
public static void word(){
    System.out.println("word:");
    String pattern = "java";
    String text = "java is a programming language javascript";
    
    Pattern p =Pattern.compile(pattern);
    Matcher m=p.matcher(text);
    while (m.find()) {
            System.out.println("The string contains the word 'Java'" +"'at index " +m.start());
        } 
}
}
