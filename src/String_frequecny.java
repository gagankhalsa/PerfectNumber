import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by GAGAN on 28/06/2017.
 */
public class String_frequecny {

    public static void main(String args[]) {
        String_frequecny sf=new String_frequecny();
        sf.WithChar();
            /*String str1,str2;
            int j=0;
            String [] arr;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a string");
            str1=sc.nextLine();
             arr = new String[str1.length()];
             arr=str1.split(" ");
            for (int i=0;i<arr.length;i++) {
                System.out.print(arr[i]);
            }
            System.out.println("enter a string to search");
            str2=sc.nextLine();
                       for( int i=0;i<arr.length;i++)
           {
               if (arr[i].equals(str2))
               {
                   j++;
               }
           }
            System.out.println("frequency is:"+j);


        }
    */}
        public void WithChar()
        {
            String str1, str2;
            char a;
            Scanner sc = new Scanner(System.in);
            System.out.print("enter first String:");
            str1 = sc.nextLine();
            str1 = str1 + " ";
            System.out.print("enter String to search:");
            str2 = sc.nextLine();
            int l = str1.length();
            String s1 = "";
            int c = 0;
            System.out.println("length is " + l);
            for (int i = 0; i < l; i++) {
                a = str1.charAt(i);
                if (a != ' ') {
                    s1 = s1 + a;
                    // System.out.println(s1);
                } else {
                    //System.out.println(s1);
                    if (s1.equalsIgnoreCase(str2) == true) {
                        c++;
                        System.out.println(s1);
                    }
                    s1 = "";
                }

            }
            System.out.println(str2 + "is" + c);
        }
    }
