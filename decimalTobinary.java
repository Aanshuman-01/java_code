import java.util.Scanner;
public class decimalTobinary
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the decimal number:");
    int n1=sc.nextInt();
    String b1="";
    while(n1>0)
    {
    int ans=n1%2;
    n1=n1/2;
    b1=ans+b1;
    }
    System.out.println("The binary number is:"+b1);
 }   
}
