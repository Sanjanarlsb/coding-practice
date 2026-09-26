public class find_max_even {

    static int maxeven(int arr[])
    {
        int largest = -1;

        // Find the first even number
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                largest = arr[i];
                break;
            }
        }

        // If no even number was found
        if(largest == -1)
        {
            return -1;
        }

        // Find the largest even number
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0 && arr[i] > largest)
            {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args)
    {
        int arr[] = {7, 12, 5, 20, 18, 9, 3};

        System.out.println(maxeven(arr));
    }
}