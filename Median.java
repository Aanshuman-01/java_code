/*import java.util.Arrays;
public class Median 
{
    public static void main(String args[])
    {  
        int arr[]={30,40,10,50,20};
        //int n=arr.length;
        System.out.println("Median of the array is:"+median(arr));
    }

    public static double median(int arr[])                                                                                                                                                                                                                                                                                                                       median(int arr,int a)
    {
       Arrays.sort(arr);
       int n=arr.length;
       if(n % 2 == 1)
       {
        return arr[n / 2];
       }
       else
       {
        return (arr[(n-1) / 2]+arr[n / 2]) / 2.0;
       }
    } 
    
}
/*import java.util.Arrays;

public class Median {
    public static void main(String[] args) {  
        int arr[] = {30, 40, 10, 50, 20};
        int n = arr.length;
        System.out.println("Median of the array is: " + median(arr, n));
    }

    public static double median(int arr[], int n) {
        Arrays.sort(arr);
        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            return (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
        }
    }
}*/