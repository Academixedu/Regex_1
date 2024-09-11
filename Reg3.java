import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg3{
// Extract all the digits from a string.
public static void main(String[] args) {
    digits("The year is 2024 and the time is 09:45 AM.");
    digits("The id is 123-456-5890.");
}
public static void digits(String input){
    System.out.println("extracting digits from : " + input );
    String pattern = "\\d+";
    
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(input);
    while(m.find()){
    System.out.println("Found digits: "+m.group());
}

}
}
