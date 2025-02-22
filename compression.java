/*1.You are given a string.
  2.You have to compress the givenstring i the following two ways-
    First compression->The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
    For "aaabbccdee",the compressed string will be "abcde".
    Second compression->The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.

    For "aaabbccdee",the compressed string will be "a3b2c2de2".*/

import java.util.*;
public class compression
{
    public static String compression1(String str)
    {
        String x=str.charAt(0)+"";
        for(int i=1;i<str.length();i++)
        {
            char curr=str.charAt(i);
            char pre=str.charAt(i-1);
            if(curr!=pre)
            {
              x+=curr;
            }
        }
         return x;
    }

    public static String compression2(String str)
    {
      int count=1;
      String y=str.charAt(0)+"";
      for(int i=1;i<str.length();i++)
      {
        char curr=str.charAt(i);
        char pre=str.charAt(i-1);
        if(curr==pre)
        {
          count++;
        }
        else
        { 
          if(count>1)
          {
           y+=count;
           count=1;
          }
          y+=curr;
        }
      }
      if(count>1)
      {
        y+=count;
        count=1;
      }
      return y;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
}
