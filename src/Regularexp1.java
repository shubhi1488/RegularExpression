//basic regex program
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexp1 {
    public static void main(String args[]){
        Pattern p=Pattern.compile(".s");
        Matcher m=p.matcher("as");
        boolean b=m.matches();//1st way
        boolean b2=Pattern.compile("s").matcher("shashank").matches();//returns false as it has more than 2 characters
        boolean b3=Pattern.matches(".s","as");//3rd way
        System.out.println(b);
        System.out.println(b2);
        System.out.println(b3);
    }
}

