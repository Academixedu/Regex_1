import java.util.regex.*;
import java.util.Scanner;
public class Reg3{
// Extract all the digits from a string.

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String - ");
        String str=s.nextLine();

        String regex="\\d+";

        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(str);

        while(m.find()){
            System.out.println(m.group());
        }
    }
}
