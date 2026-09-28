public class largest_difference {
    static int difference(int arr[])
    {
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        return largest-smallest;
    }
    public static void main(String[] args)
    {
        int arr[]={10, 5, 25, 8, 15};
        System.out.println(difference(arr));
    }
    
}
