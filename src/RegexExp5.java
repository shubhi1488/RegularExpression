/*
Create a regular expression that accepts 10 digit numeric characters
 starting with 7, 8 or 9 only
 */
import java.util.regex.Pattern;

public class RegexExp5 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9953038949"));//true
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","99530389490"));//false as length is increased
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","3853038949"));//false as starting without 7/8/9
    }
}
