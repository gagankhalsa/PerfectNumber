import java.util.Scanner;

/**
 * Created by GAGAN on 28/06/2017.
 */
public class Remove_vowels {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str =sc.nextLine();
        int a=str.length();
        String strnew=str.replaceAll("[aeiouAEIOU]", "");
        int b=strnew.length();
        System.out.println(strnew);
        System.out.println("total vowles are:" +(a-b));
    }
}
