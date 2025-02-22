public class selection_sort {
    public static void main(String args[])
    {
        int arr[]={64,25,12,22,11};

        System.out.println("Unsorted array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        for(int i=0;i<arr.length-1;i++)
        {
            int min_index=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min_index]>arr[j])
                {
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        System.out.println("\nsorted array is:");
        for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
        
    }
    }
    
}
