import java.util.regex.*;
import java.util.Scanner;

public class Reg3{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String regex="\\d+";
        Pattern p=Pattern.compile(regex);
        Matcher M=p.matcher(str);
        while(M.find()){
            System.out.println(M.group());
        }

    }
// Extract all the digits from a string.
}
