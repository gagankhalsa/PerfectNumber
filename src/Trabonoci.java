import java.util.Scanner;

/**
 * Created by GAGAN on 28/06/2017.
 */
public class Trabonoci {
    public static void main(String args[])
    {
        int a=0,b=1,c=2,d,in;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter any number");
        in=sc.nextInt();


        System.out.print(a+","+b +", "+c+" ");
        for (int i=1;i<=in;i++)
        {
            d=a+b+c;
            System.out.print(","+" "+d);
           a=b;
           b=c;
           c=d;

        }

    }
}
