import java.util.Scanner;
public class countwords
{ 
   public static void main(String args[])
  {
    String str;
    int count=0;
    System.out.println("String is:");
    try (Scanner sc = new Scanner(System.in)) {
      str=sc.nextLine();
    }
    for(int i=0;i<str.length();i++)
    {
      char ch=str.charAt(i);
      if(ch==' ')
      {
      count++;
      }
    } 
    System.out.println("Number of words present in the string:"+(count+1));   
       
  }
}
