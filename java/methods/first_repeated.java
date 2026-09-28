public class first_repeated {
    static int firstrepeat(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]==arr[i])
                {
                    return arr[j];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[]={5, 3, 7, 3, 2, 5};
        System.out.println(firstrepeat(arr));
    }
    
}
