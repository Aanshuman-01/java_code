import java.util.*;
public class Substring 
{
    public static void  substring(String stri)
    {
        for(int i=0;i<stri.length();i++)
        {
            for(int j=i;j<=stri.length();j++)
            {
                System.out.println(stri.substring(i,j));
            }
        }
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            String str=sc.nextLine();
            System.out.print("The substrings of the string are:");
            substring(str);
        }
    }
}
