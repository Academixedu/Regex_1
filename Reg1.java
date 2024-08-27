import java.util.regex.*;
import java.util.Scanner;
public class Reg1{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String regex = "^[a-zA-Z][a-zA-Z0-9]{0,18}[0-9]{0,2}@gmail\\.com$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        if(m.matches())
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");

    }
// Prepare a Regex for Email Validation
}
