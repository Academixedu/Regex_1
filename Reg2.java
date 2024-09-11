public class Reg2{
    public static void main(String[] args) {
    String text = "I love Java programming!";
    String regex = "\\bJava\\b";
    System.out.println(text.matches(".*" + regex + ".*") ? "Contains 'Java'" : "Does not contain 'Java'");

    }
// Prepare a Regex to Find if a string contains the word "Java".
}
