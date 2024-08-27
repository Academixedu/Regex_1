import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Extract all the digits from a string.

        public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Sentence:");
        String str=in.nextLine();
        String regex="\\d+";
        Pattern p=Pattern.compile(regex);
        Matcher M=p.matcher(str);
        while(M.find()){
            System.out.println(M.group());
        }

    }
}

