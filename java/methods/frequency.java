public class frequency {

    static void frequency(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            int count = 0;

            for(int j = 0; j < arr.length; j++)
            {
                if(arr[j] == arr[i])
                {
                    count++;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {2, 3, 2, 4};

        frequency(arr);
    }
}
