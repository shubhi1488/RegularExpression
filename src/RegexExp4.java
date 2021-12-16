
//Regex example which have only alphanumeric values
import java.util.regex.Pattern;

public class RegexExp4 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun32"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arunagarwal90"));//more than six characters
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","ar&un"));//& is not matched
    }
}
