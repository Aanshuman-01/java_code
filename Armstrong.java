import java.util.Scanner;
public class Armstrong 
{
     public static void main(String args[])
    {
        int number;
        try (Scanner sc= new Scanner(System.in)) {
            System.out.println("Enter the number:");
            number=sc.nextInt();
        }
        System.out.println("Is Armstrong number:"+isArmstrong(number));
    }
        
        static boolean isArmstrong(int n)
        {
          int temp,digits=0;
          int sum=0;
          temp=n;
          while(temp>0)
          {
            temp=temp/10;
            digits++;
          }
          System.out.println("Number of digits:"+digits);
          temp=n;
          int lastdigit;
          while(temp>0)
          {
            lastdigit=temp%10;
            sum=(int)(sum+Math.pow(lastdigit,digits));
            temp=temp/10;
          }
          System.out.println("sum is:"+sum);
          if(sum==n)
          {
            return true;
          }
          else{
          return false;}
        }     
}
