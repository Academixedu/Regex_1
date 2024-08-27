public class Reg1{
// Prepare a Regex for Email Validation
public static String Email="^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z]{3}$";
public static void main(String[] args) {
    String email="swarupajangam18@gmail.com";
    if(email.matches(Email)){
        System.out.println("Valid Email: "+email);
    }
    else{
        System.out.println("Invalid Email"+email);
    }
}

}
