import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1{
// Prepare a Regex for Email Validation
public static void mail(){
        Scanner l=new Scanner(System.in);
        System.out.println("Enter your Mail");
        String Email="^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,6}$";
        String m=l.nextLine();
        Pattern p=Pattern.compile(Email);
        Matcher s=p.matcher(m);
        if (s.find()) {
            System.out.println("accepted your mail");
        }
        else{
            System.out.println("mail not acceptable");
        }

    }
    public static void main(String[] args) {
        mail();
    }
}
