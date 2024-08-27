
package collections;

import java.util.Scanner;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class findJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your code");
        
        String input = sc.nextLine();

                String javaRegex = "\\bJava\\b";
        
                Pattern pattern = Pattern.compile(javaRegex);
                Matcher matcher = pattern.matcher(input);
        
                if (matcher.find()) {
                    System.out.println("The word 'Java' is found in the string.");
                } else {
                    System.out.println("The word 'Java' is not found in the string.");
                }
            }
        }
        
}
