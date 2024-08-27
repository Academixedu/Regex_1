 import java.util.Scanner;

public class Reg3{
// Extract all the digits from a string.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String regex = "[0-9]+";
        if(str.matches(regex))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}
