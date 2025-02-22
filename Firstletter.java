//print first letter of every word of a string
import java.util.Scanner;
public class Firstletter 
{
    public static void main(String args[])
    {
        String str;
        System.out.println("String is:");
        try (Scanner sc = new Scanner(System.in)) {
          str=sc.nextLine();
        }
        str=" "+str;
        String s="";

        for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);
          if(ch==' ')
          {
            s=s+str.charAt(i+1);
          }
        }
        System.out.println(s);
    }
    
}
