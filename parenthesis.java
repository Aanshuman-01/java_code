/*
Given a string that consists of left and right parentheses, '(' and ')', balance the
parentheses by inserting parentheses as necessary. Determine the minimum
number of characters that must be inserted.
Example:
1. s = (()))
Insert 1 left parenthesis at the left end of the string to get '((()))'. The string is
balanced after 1 insertion.

2. s= ))((
Insert 2 left parentheses at the start and 2 right parentheses at the end of the
string to get (())(()) prime after 4 insertions.

Constraints:
1 ≤ length of s ≤ 10^5

*/

import java.util.Scanner;
public class parenthesis 
{
   public static int insert(String s)
   {
    int opening=0,closing=0;
    for(int i=0;i<s.length();i++)
    {
        char c=s.charAt(i);
        if(c=='(')
        {
            opening++;
        }
        else
        {
            if(opening>0)
            {
                opening--;
            }
            else
            {
            closing++;
            }
        }
    }
    return opening+closing;
   }
  public static void main(String args[])
  {
    try (Scanner sc = new Scanner(System.in)) {
        String s=sc.nextLine();
        System.out.println("The minimum insertion required for balancing the string parenthesis:");
        System.out.println(insert(s));
    }
  }    
    
}
