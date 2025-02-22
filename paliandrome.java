import java.util.Scanner;
public class paliandrome 
{
    @SuppressWarnings("resource")
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("The number is:");
        int n=sc.nextInt();

        int temp=n,reversedNumber=0;
        int sum;
        while(temp>0)
        {
            sum=temp%10;
            reversedNumber=reversedNumber*10+sum;
            temp=temp/10;
        }
        if(reversedNumber==n)
        {
            System.out.println("Number is a paliandrome number");
        }
        else
        {
            System.out.println("Number is not a paliandrome number");
        }
    }
    
}
