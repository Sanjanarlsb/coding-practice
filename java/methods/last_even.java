public class last_even {
    static int lasteven(int arr[])
    {
        int last = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                last = arr[i]
            }
        }
        return last;
    }
    public static void main(String[] args)
    {
        int arr[] = {5, 12, 7, 18, 20, 9};
        System.out.println(lasteven(arr));
    }
    
}
