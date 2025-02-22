public class Maxsum_subarray 
{
    public static void main(String args[])
    {
        int sub_arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=sub_arr.length;
        System.out.println("Maximum sum of the subarray is:"+maximum(sub_arr,n));

    }
    public static int maximum(int sub_arr[],int a)
    {
        int max=sub_arr[0];
        int sum=0;

        for(int i=0;i<a;i++)
        {
             sum=sum+sub_arr[i];
             if(sum>max)
             {
                max=sum;
             }
             if(sum<0)
             {
                sum=0;
             }
        
        }
        return max;
    }
    

}
