
import java.util.*;
public class Reg1
{
// Prepare a Regex for Email Validation
public static void main(String[] args) 
{
   Scanner in =new Scanner(System.in);
   System.out.println("Enter Your Email-Id => ");
   String Emailid=in.nextLine();

   String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
   boolean result=Emailid.matches(regex);

   if(result)
   {
    System.out.println("Given Email-Id is Valid");
   }
   else 
   {
    System.out.println("Given Email-Id is Not Valid");
   }
   in.close();
       
}

}