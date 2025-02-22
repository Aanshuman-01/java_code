import java.util.Scanner;
public class Prime 
{
    public static void main(String args[])
    {
        System.out.println("Enter two numbers:");
        int n1,n2,i,j;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(i=n1;i<=n2;i++)
        {
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                break;
            }
            if(i==j)
            System.out.print(j +" ");
        }
    }
    
}
