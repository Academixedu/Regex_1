import java.util.Scanner;

public class Reg1{
// Prepare a Regex for Email Validation
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email: ");
        String email = sc.nextLine();
        String regexpattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9]+[.][a-zA-Z]+$";
        if(email.matches(regexpattern))
            System.out.println(" it is a Valid Email");
        else
            System.out.println(" it is a Invalid Email");
        sc.close();
    }
}
