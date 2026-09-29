public class removing_duplicates
{
    static int removeDuplicates(int arr[])
    {
        int pos = 1;

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] != arr[i-1])
            {
                arr[pos] = arr[i];
                pos++;
            }
        }

        return pos;
    }

    public static void main(String[] args)
    {
        int arr[] = {1, 1, 2, 2, 3, 4, 4};

        int size = removeDuplicates(arr);

        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}