// Prepare a Regex to Find if a string contains the word "Java".
  import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Prepare a Regex to Find if a string contains the word "Java".
public static void main(String[] args) {
    

 String pattarn ="Java";
    String text ="I am learning Java and  Java is my favorite ";

    Pattern p=Pattern.compile(pattarn);
    Matcher m=p.matcher(text);
    while(m.find())
     System.out.println(m.group() +" is in "+m.start()+" index"); 

}
}
}
