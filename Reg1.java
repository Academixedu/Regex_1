import java.util.regex.Pattern;
public class Reg1{
// Prepare a Regex for Email Validation
    private static final String EV= "^[\\w!#$%&'*+/=?`{|}~^.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";

    public static boolean isValidEmail(String email) {

        Pattern p = Pattern.compile(EV);
        return p.matcher(email).matches();
    }
    public static void main(String[] args) {

        String TE1 = "java1@gmail.com";

        System.out.println(isValidEmail(TE1));  
    }
}


