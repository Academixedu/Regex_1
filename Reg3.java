import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Extract all the digits from a string.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String pattern = sc.nextLine();
    String text = sc.nextLine();

    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(text);

    while(m.find()){
        System.out.println(m.group());
    }
}
}
