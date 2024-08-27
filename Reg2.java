import java.util.Scanner;

public class Reg2{
// Prepare a Regex to Find if a string contains the word "Java".
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String regex = "Java";
        if(str.matches(regex))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}
