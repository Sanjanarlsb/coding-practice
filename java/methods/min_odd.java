public class min_odd {

    static int minodd(int arr[])
    {
        int smallest=0;
        boolean found = false;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 != 0)
            {
                smallest = arr[i];
                found = true;
                break;
            }
        }
        if(!found)
        {
            return -1;
        }

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 != 0 && arr[i] < smallest)
            {
               smallest = arr[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args)
    {
        int arr[] = {7, 12, 5, 20, 18, 9, 3};

        System.out.println(minodd(arr));
    }
}
