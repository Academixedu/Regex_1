public class Reg1{
// Prepare a Regex for Email Validation
  public static void emailvalidation(String email){

    String pattern = "^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,6}$";


    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(email);

    if(m.matches()){
        System.out.println("Valid email");
    }
    else{
        System.out.println("Invalid email");
    }
    System.err.println(" ");

}
public static void main(String[] args) {
    Reg1 r = new Reg1();
    r.emailvalidation("sugguna156@gmail.com");
}
}
