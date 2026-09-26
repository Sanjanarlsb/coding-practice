public class basic_method{
    static int arraySum(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int arr[]={10,20,30,40};
        int result = arraySum(arr);
        System.out.println(result);
    }

}
