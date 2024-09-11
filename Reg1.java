import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1{
// Prepare a Regex for Email Validation
    public static void mail(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Mail");
        String Email="^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,6}$";
        String text=s.nextLine();
        Pattern p=Pattern.compile(Email);
        Matcher m=p.matcher(text);
        if (m.find()) {
            System.out.println("accepted your mail" +Email);
        }
        else{
            System.out.println("mail not acceptable");
        }

    }
    public static void main(String[] args) {
        mail();
    }
}
