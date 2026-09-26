public class first_even {
    static int firsteven(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {7, 9, 13, 8, 20, 4};
        System.out.println(firsteven(arr));
    }
    
}
