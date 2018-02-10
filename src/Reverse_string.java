import java.util.Scanner;

/**
 * Created by GAGAN on 30/06/2017.
 */
public class Reverse_string {
    public static void main(String args[]) {
        String str1,a="";
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first String:");
        str1 = sc.nextLine();
        String [] arr=new String[str1.length()];
        for (int i=(arr.length)-1;i>=0;i--)
        {
            System.out.print("String:"+ arr[i]);
        }



    }
}