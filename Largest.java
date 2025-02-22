public class Largest
{

    static int largestElement(int[] arr, int n) {
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
          if(arr[i]>max)
          {
              max=arr[i];
          }
        }
          return max;
    }
    public static void main(String args[])
    {
        int arr[]={12,3,4,6,3,13};
        int a=arr.length;
        System.out.println("Largest element of the array:"+largestElement(arr,a));
    }
}
    

