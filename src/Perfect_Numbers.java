import java.util.Scanner;

/**
 * Created by GAGAN on 21/06/2017.
 */
public class Perfect_Numbers {

public static  void main(String args[]) {
    Perfect_Numbers pf=new Perfect_Numbers();
    pf.perfectByinput();
    pf.perfectnum1000();
}

public void perfectByinput() {
    int n, i = 1, sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number :");
    n = sc.nextInt();
    while (i < n) {
        if (n % i == 0) {
            sum = sum + i;
        }
        i++;
    }
    if (sum == n) {
        System.out.println("Number is perfect");
    } else {
        System.out.println("number is not perfect");
    }
}
public void perfectnum1000(){
    int i,sum;
    System.out.print("perfect numbers are :");
    for (int n=1;n<=1000;n++)
    {
        i=1;
        sum=0;
     while(i<n){
         if (n%i==0) {
             sum = sum + i;
         }
         i++;
     }
if (sum==n)
{
  System.out.print(n +" ");
}

}
    }

}
