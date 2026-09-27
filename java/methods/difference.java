public class difference {
    static int difference(int arr[])
    {
        int largest=arr[0];
        int smallest=arr[0];
        int difference = 0;
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
         difference = largest-smallest;
        }
        return difference;
    }
    public static void main(String[] args)
    {
        int arr[] = {12, 5, 20, 8, 3, 15};
        System.out.println(difference(arr));
    }
    
}
