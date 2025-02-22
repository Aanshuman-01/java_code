public class sort 
{
    public static void main(String args[])
    {   
        int temp;
        int arr[]={43,2,1,4,33,24};
        System.out.print("original array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            if(arr[j]<arr[i])
            {
              temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
            }
        }
        System.out.print("\nsorted array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    
}
