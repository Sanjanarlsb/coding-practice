public class secondSmallest {
    static int secondsmallest(int arr[])
    {
        int smallest = arr[0];
        int secondSmallest = arr[1];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                secondSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i] < secondSmallest)
            {
                secondSmallest=arr[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String [] args)
    {
        int arr[] = {10, 25, 7, 40, 18, 32};
        System.out.println(secondsmallest(arr));
    }
    
}

