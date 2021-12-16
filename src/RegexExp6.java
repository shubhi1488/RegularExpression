/*
Write a regular expression to represent all names starting with n|N with any length
 */
import java.util.regex.Pattern;

public class RegexExp6 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[nN]?[a-zA-Z]{7}","Nishant"));
    }
}
