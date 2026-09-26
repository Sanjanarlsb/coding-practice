public class even_sum{
    static int sumeven(int arr[])
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                sum=sum+arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int arr[] = {10, 5, 8, 3, 12, 7};
         System.out.println(sumeven(arr));
    }
}