import java.util.Scanner;

/**
 * Created by GAGAN on 29/06/2017.
 */
public class Remove_string {
    public static void  main(String args[])
    {
        String str1,str2;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first String:");
        str1=sc.nextLine();
        String [] arr1=new String[str1.length()];
        arr1=str1.split(" ");
        System.out.print("enter second String:");
        str2=sc.nextLine();
        String [] arr2=new String[str2.length()];
        arr2=str2.split(" ");
        for (int i=0;i<arr1.length;i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr1[i].equals(arr2[j])) {
                    arr1[i]="";
                }
                else{
                   // System.out.print("else is working");
            }
            }
        }
            for (int i1=0;i1<arr1.length;i1++)
            {
                System.out.println(arr1[i1]);
            }

        }
    }

