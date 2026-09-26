public class evencount {
    static int even(int arr[])
    {
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[]={10, 15, 22, 7, 8, 13};
        int result=even(arr);
        System.out.println(result);
    }
    
}
