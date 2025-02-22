import java.util.Scanner;
public class factorial {
    public static void main(String args[])
    {
        System.out.println("Enter the number:");
        try (Scanner sc = new Scanner(System.in)) {
            int number=sc.nextInt();
            System.out.println("Factorial of a number is:"+Factorial(number));
        }
    }
    public static int Factorial(int n)
    {
      if(n==1)
      {
        return 1;
      }
      return n*Factorial(n-1);
    }
}
