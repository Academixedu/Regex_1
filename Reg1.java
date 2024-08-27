
package collections;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Extractemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your email");
        
        String email = sc.nextLine();

        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

       
        if (matcher.matches()) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is not a valid email address.");
        }
    }
}


}
