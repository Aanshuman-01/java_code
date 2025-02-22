import java.util.Scanner;
public class LCM {
    public static void main(String args[])
    {
        int num1,num2;
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number:");
        num1=sc.nextInt();
        System.out.println("Enter the Second number:");
        num2=sc.nextInt();

        int lcm=num1>num2?num1:num2;
        while(true)
        {
            if(lcm%num1==0 && lcm%num2==0)
            {
                System.out.println("LCM of the two numbers:"+lcm);
                break;
            }
             lcm++;
        }
    }
    
}
