import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Extract all the digits from a string.
public static void digits(){
        Scanner ms=new Scanner(System.in);
        String m="\\d";
        String a=ms.nextLine();

        Pattern p=Pattern.compile(m);
        Matcher s=p.matcher(a);
while (s.find()) {
    System.out.println(s.group());
}

    }
    public static void main(String[] args) {
        Reg3.digits();
    }
}
