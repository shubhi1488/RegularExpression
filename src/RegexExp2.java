//Quantifiers -regular expression
import java.util.regex.Pattern;

public class RegexExp2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[amn]?","a"));//true as a occured once
        System.out.println(Pattern.matches("[amn]?","aaa"));//false as a occured more than one times
        System.out.println(Pattern.matches("[amn]+","a"));//true as a/m/n occured one/more than one times
        System.out.println(Pattern.matches("[amn]+","azzttaa"));//false as z and t are not matching pattern
        System.out.println(Pattern.matches("[amn]*","mnna"));//true as m/n/a comes zero or more than zero times
    }
}
