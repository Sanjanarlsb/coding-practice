public class first_non_repeated{
    static int nonrepeated(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int count = 0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==arr[i])
                {
                    count++;//Each element count checking
                }
            }
            if(count==1)
            {
                return arr[i];//Element that is not repeated
            }
        }
        return -1;
        
    }
    public static void main(String[] args)
    {
        int arr[]={5, 3, 7, 3, 2, 5};
        System.out.println(nonrepeated(arr));
    }
}