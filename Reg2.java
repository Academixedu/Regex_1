import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Prepare a Regex to Find if a string contains the word "Java".

       public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
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
}
