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
        String strnew=str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(strnew);
    }
}
