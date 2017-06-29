import java.util.Scanner;

/**
 * Created by GAGAN on 27/06/2017.
 */
public class Reverse_Num {
    public static void main(String arg[])
    {
        int num,reverse=0,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        num=sc.nextInt();
        while(num!=0)
        {
            r=num%10;
            reverse=reverse*10+r;
            num=num/10;
        }
        System.out.print(reverse);
    }
}
