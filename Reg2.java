import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Prepare a Regex to Find if a string contains the word "Java".
public static void word(){
        Scanner x=new Scanner(System.in);
        String j="java";
        System.out.println("enter yor word");
        String ms=x.nextLine();
        Pattern p=Pattern.compile(j);
        Matcher s=p.matcher(ms);
        while (s.find()) {
            System.out.println(s.group()+"  "+s.start());
        }
    }
    public static void main(String[] args) {
        word();
    }
}
