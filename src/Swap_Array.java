import java.util.Scanner;

/**
 * Created by GAGAN on 23/06/2017.
 */
public class Swap_Array {
    public static void main(String args[])
    {
        int [] a= new int[10],b=new int[10],c=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Array:");
        for (int i=0;i<3;i++){
            a[i]=sc.nextInt();

                    }
        System.out.print("Enter second Array:");
        for (int i=0;i<3;i++){
          b[i]=sc.nextInt();
        }
        System.out.println("Arrays before swapping:");
        System.out.println("First Array:");
        for (int i=0;i<10;i++)
        {
            System.out.println(" " +a[i]);
        }
        System.out.println("second Array:");
        for (int i=0;i<3;i++)
        {
            System.out.println(" " +b[i]);
        }
        System.out.println("After Swapping:");
        for (int i=0;i<10;i++)
        {
            c[i]=a[i];
            a[i]=b[i];
            b[i]=c[i];
        }
        System.out.println("First Array:");
        for (int i=0;i<10;i++)
        {
            System.out.println(" " +a[i]);
        }
        System.out.print("second Array:");
        for (int i=0;i<3;i++)
        {
            System.out.println(" " +b[i]);
        }
    }
}
