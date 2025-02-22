import java.util.*;
public class binaryTodecimal 
{
    public static void main(String args[])
    {
        System.out.println("Enter the binary number:");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int ans=0,ldigit=1;
        while(n1!=0)
        {
            int placevalue=n1%10;
            n1=n1/10;
            ans=ans+placevalue*ldigit;
            ldigit=2*ldigit;
        }
        System.out.println("The decimal number is:"+ans);
    }
    
}
