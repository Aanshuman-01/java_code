//sum of all non-prime index number in a given array
public class Non_prime 
{
    public static void main(String args[])
    {
        System.out.println("The given array is:");
        int arr[]={2,3,4,3,5,7};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nSum of the elements that are present at the non_prime index of the given array:"+nonprimeIndex(arr));
        
    }
    public static int nonprimeIndex(int arr[])
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
           if(flag!=2)
           sum=sum+arr[i];
        }
        return sum;
    }
    
}
