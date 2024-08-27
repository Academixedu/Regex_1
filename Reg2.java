import java.util.regex.*;
import java.util.Scanner;
public class Reg2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String regex="\\bJava\\b";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(str);
        if(m.find()){
            System.out.println("word Found");
        }
        else
            System.out.println("word Not Found");
    }
// Prepare a Regex to Find if a string contains the word "Java".
}
