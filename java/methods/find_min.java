public class find_min {
    static int findmin(int arr[])
    {
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++)
            {
                if(arr[i]<smallest)
                {
                    smallest=arr[i];
                }
            }
            return smallest;
    }
    public static void main(String[] args)
    {
        int arr[] ={10, 45, 23, 67, 12};
        int result=findmin(arr);
        System.out.println(result);
    }
    
}
