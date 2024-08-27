public class Reg3{
// Extract all the digits from a string.
public static void main(String[] args) {
    String s1="Swarupa12345@saru875";
    String digit="";
    for(char c:s1.toCharArray()){
        if(Character.isDigit(c)){
            digit=digit+c;
        }
    }
    System.out.println(digit);
}
}
