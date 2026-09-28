public class moving_zeroes {
    static void moving(int arr[])
    {
        int pos=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[pos]=arr[i];
                pos++;
            }
        }
        for(int i = pos; i < arr.length; i++)
           {
                arr[i] = 0;
           }
        for(int i=0;i<arr.length;i++)
           {
                System.out.print(arr[i] + " ");
            }
    }
    public static void main(String[] args)
    {
        int arr[]={0, 5, 0, 3, 8, 0, 2};
        moving(arr);
    }
    
}
