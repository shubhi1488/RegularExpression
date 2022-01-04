import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
WAP in java to check string contains special characters in java
 */
public class Special_characters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Pattern p=Pattern.compile("[^a-zA-Z0-9]");
        Matcher m=p.matcher(str);
        boolean b=m.find();
        if(b){
            System.out.println(str+"contains special character");
        }
        else
            System.out.println(str+"doesnot contain special character");

    }
}
