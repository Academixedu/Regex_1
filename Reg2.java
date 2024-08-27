import java.util.regex.*;
import java.util.Scanner;
public class Reg2{
// Prepare a Regex to Find if a string contains the word "Java".
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter String -");

    String str=s.nextLine();

    String regex="Java";

    Pattern p=Pattern.compile(regex);
    Matcher m=p.matcher(str);

    if(m.find()){
    System.out.println("Yes, Contains word Java");
    }
    else{
    System.out.println("No, Doesn't contain word Java");
    }
}
}
