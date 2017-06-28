import java.util.Scanner;

/**
 * Created by GAGAN on 23/06/2017.
 */
public class SplitNumber {
    public static void main(String args[])
    {
       int num,temp,factor=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        num=sc.nextInt();
        temp=num;
        while(temp!=0)
        {
            temp=temp/10;
            factor=factor*10;
        }
     System.out.print("Each digits of numbers are:"+ temp);
    }
}
