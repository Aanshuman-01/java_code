public class Second_largest {
           static int secondLargest(int arr[],int n)
           {
            int max=arr[0];
            for(int i=0;i<n;i++)
            {
               if(arr[i]>max)
               {
                max=arr[i];
               }
            }
            int slargest=-1;
            for(int i=0;i<n;i++)
            {
                if(arr[i]>slargest && arr[i]!=max)
                {
                    slargest=arr[i];
                }
            }
            return slargest;
           }

           public static void main(String args[])
           {
            int arr[]={2,4,7,5,7,1};
            int a=arr.length;
            System.out.println("The second largest element is:"+secondLargest(arr,a));
           }
}
