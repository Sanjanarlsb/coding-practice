public class find_max {
    static int findMax(int arr[])
    {
        int largest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args)
    {
        int arr[] = {10, 45, 23, 67, 12};
        int result=findMax(arr);
        System.out.println(result);
    }
    
}
