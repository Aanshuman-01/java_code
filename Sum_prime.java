public class Sum_prime 
{
    public static void main(String args[])
    {
     System.out.println("The given array is:");
     int arr[]={2,3,4,3,5,7};
     for(int i=0;i<arr.length;i++)
     {
        System.out.print(arr[i]+" ");
     }
     System.out.println("\nsum of the elements that are present in prime indexes of the given array is:"+sumPrime(arr));

    }
    public static int sumPrime(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            int flag=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                flag++;
                }
            }
            if(flag==2)
            {
                sum=sum+arr[i];
            }
        }
        return sum;

    }
    
}
