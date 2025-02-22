/*A palindrome reads the same from left or right, mom for example. There is a
palindrome which must be modified, if possible. Change exactly one character
of the string to another character in the range ascii[a-z] so that the string
meets the following three conditions:
1. The new string is lower alphabetically than the initial string.
2. The new string is the lowest value string alphabetically that can be created
from the original palindrome after making only one change.
3. The new string is not a palindrome.
Return the new string, or, if it not possible to create a string meeting the
criteria, return the string IMPOSSIBLE.

Example:
1. palindromeStr = 'aaabbaaa'
* Possible strings lower alphabetically than 'aaabbaaa' after one change are
['aaaabaaa 'aaabaaaa'].
* 'aaaabaaa' is not a palindrome and is the lowest string that can be created
from palindromeStr

Function Description:
Complete the function breakPalindrome in the editor below.
breakPalindrome has as the the following parameter(s): string palindromeStr:
the original string

Returns:
string: the resulting string, or IMPOSSIBLE if one cannot be formed

Constraints:
1 ≤ length of palindromeStr ≤ 1000
*/


import java.util.Scanner;
public class modified_paliandrome
{
    public static String modify(String paliandromeStr)
    {
      for(int i=0;i<paliandromeStr.length();i++)
      {
        char c=paliandromeStr.charAt(i);
        if(c!='a')
        {
            c='a';
            break;
        }
      }
      return paliandromeStr;
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
          String paliandromeStr=sc.nextLine();
          System.out.println("The paliandrome string after modification becomes:");
          System.out.println(modify(paliandromeStr));
        }
    }
    
}
