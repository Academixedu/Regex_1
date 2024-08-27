import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg3{
// Extract all the digits from a string.
public static void main(String args[]){
    String pattern ="\\d+";
    Scanner s=new Scanner(System.in);
    System.out.println("enter text");
    String text=s.nextLine();
    Pattern p= Pattern.compile(pattern);
    Matcher m=p.matcher(text);
    System.out.println("Digits found:");
    while (m.find()) {
        System.out.println(m.group());
    }

    s.close();


}
}
