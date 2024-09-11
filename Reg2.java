import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Prepare a Regex to Find if a string contains the word "Java".
    public static void word(){
        Scanner x=new Scanner(System.in);
        String s="java";
        String text=x.nextLine();
        Pattern p=Pattern.compile(s);
        Matcher m=p.matcher(text);
        while (m.find()) {
            System.out.println(m.group()+"  "+m.start());
        }
    }
    public static void main(String[] args) {
        word();
    }
}