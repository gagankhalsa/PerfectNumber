import java.util.Scanner;

/**
 * Created by GAGAN on 21/06/2017.
 */
public class Perfect_Numbers {

public static  void main(String args[]) {
    int n,i=1,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number :");
    n = sc.nextInt();
    while (i<n){
        if (n%i==0){
            sum=sum+i;
        }
        i++;
    }
    if (sum==n)
    {
        System.out.print("Number is perfect");
    }
    else{
        System.out.print("number is not perfect");
    }
}
}