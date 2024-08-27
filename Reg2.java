import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg2{
// Prepare a Regex to Find if a string contains the word "Java".
public static void main(String args[]){

String pattern = "java";
Scanner s=new Scanner(System.in);
System.out.println("enter text");
String text = s.nextLine();

Pattern p = Pattern.compile(pattern);
Matcher m = p.matcher(text);

if (m.find()) {
    System.out.println("FOUND");
}
else{
    System.out.println("NOT FOUND");
}

}
}
