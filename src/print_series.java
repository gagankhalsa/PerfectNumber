import java.util.Scanner;

/**
 * Created by GAGAN on 28/06/2017.
 */
public class print_series {
    public static void main(String args[]) {
        int i, n,s=0,j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
           //s=s*10+2;
            for (int y=1;y<=i;y++)
            {
            System.out.print("*");
            //j=j*10+i;
            //System.out.println(j+" ");
        }
            System.out.println("");
    }
}}