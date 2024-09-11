
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{

    public static void main(String[] args) {
        javastring();
    }
    public static void javastring(){
        String pattern="\\bjava\\b";
        String text="learning java and javascript";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(text);
        if(m.find()){
            System.out.println("contains the word '"+m.group()+"' at "+m.start());
        }
        else{
            System.out.println("Doesn't contains the word java");
        }
    }
}
