import java.util.Scanner;
public class Reg1{
// Prepare a Regex for Email Validation

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email:");
        String email = sc.nextLine();
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9]+[.][a-zA-Z]+$";
        if(email.matches(regex))
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");
        sc.close();
    }
}