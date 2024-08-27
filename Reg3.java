public class Reg3{

import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the values");
        String input=sc.nextLine();
        

        // Use a regular expression to extract all digits
        String digits = input.replaceAll("[^0-9]", "");

        System.out.println("Extracted digits: " + digits);
    }
}

}
