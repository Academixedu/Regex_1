import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Extract all the digits from a string.
    public static void digits(){
        Scanner y=new Scanner(System.in);
        String s="\\d";
        String text=y.nextLine();

        Pattern p=Pattern.compile(s);
        Matcher m=p.matcher(text);
while (m.find()) {
    System.out.println(m.group()+"   "+m.start());
}

    }
    public static void main(String[] args) {
        Reg3.digits();
    }
}