import java.util.Scanner;

public class Reg2{
// Prepare a Regex to Find if a string contains the word "Java".

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String regex = ".*java.*";
        if(str.matches(regex)){
            System.out.println("String contains Java");
        }
        else{
            System.out.println("String does not contain Java");
        }
        sc.close();
    }
}
