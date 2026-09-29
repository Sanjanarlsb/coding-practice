public class intersection
{
    static void intersection(int arr1[], int arr2[])
    {
        int common[] = new int[arr1.length];
        int pos = 0;

        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    common[pos] = arr1[i];
                    pos++;
                }
            }
        }

        for(int i=0; i<pos; i++)
        {
            System.out.print(common[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 5, 7, 8};

        intersection(arr1, arr2);
    }
}