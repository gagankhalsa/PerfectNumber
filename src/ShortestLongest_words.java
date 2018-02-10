import java.util.Scanner;

/**
 * Created by GAGAN on 29/06/2017.
 */
public class ShortestLongest_words {
    public static void main(String args[]) {
        String str1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first String:");
        str1 = sc.nextLine();
        str1=str1+" ";
        int len=str1.length();
        char ch=0;
        String s1="";
        int min=len,max=0;
        for(int i=0;i<len;i++)
        {
            System.out.println(min);
            ch=str1.charAt(i);
            if (ch!=' ')
            {
             s1=s1+ch;
                //System.out.println(s1);
            }
            else
            {
                int l=s1.length();
                System.out.print(s1);
              if (l<min)
              {
                  System.out.println(l);
              }
            }

        }

    }
}