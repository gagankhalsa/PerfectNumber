import java.util.Scanner;

/**
 * Created by GAGAN on 27/06/2017.
 */
public class Sum_without {
    public static void main(String args[])
    {
        int num,temp=0,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        num=sc.nextInt();
        while(num!=0)
        {
            temp=num%10;
            num=num/10;
            sum=sum+temp;

        }
        System.out.println("Sum of digits is:" + num);
    }
}
