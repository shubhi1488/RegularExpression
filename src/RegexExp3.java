//Regular expression for metacharacters
import java.util.regex.Pattern;

public class RegexExp3 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("\\d","abc"));//false as it is valid for digits only[0-9]
        System.out.println(Pattern.matches("\\d","1"));//true
        System.out.println(Pattern.matches("\\D","abc"));//false bcz more than one character
        System.out.println(Pattern.matches("\\D","m"));//true as single character
        System.out.println(Pattern.matches("\\D*","mark"));//true as it is valid for zero ormore than zero times
    }
}
