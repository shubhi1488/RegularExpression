/*
WAP to check whether the given mobile number is a valid mobile number or not .
The mobile number is entered by the command line arguement.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String mob=sc.nextLine();
        Pattern p=Pattern.compile("[789]{1}[0-9]{9}");
        Matcher m= p.matcher(mob);
        boolean b=m.matches();
        System.out.println(b);




    }
}
