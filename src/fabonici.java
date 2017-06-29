import java.util.Scanner;

/**
 * Created by GAGAN on 28/06/2017.
 */
public class fabonici {
    public static  void main(String args[])
    {
        int in;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter any number");
        in=sc.nextInt();
        int n=sc.nextInt();
        int y=sc.nextInt();
        int sum=n+y,temp,temp1=0;
        System.out.print(n+" "+y +" "+sum);
        for (int i=1;i<=in;i++)
        {
            temp = sum;
           sum=sum+y;
           y=temp;
           temp1=temp1+sum;
            System.out.print(" "+sum);
        }
         System.out.println("total sum"+ temp1);

        }
    }


