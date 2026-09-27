public class sort {
    static boolean sort(int arr[])
    {
        boolean sort = true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                sort=false;
                break;
            }
        }
        if(sort)
        {
            return true;
        }
        else
        {
           return false;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {10, 20, 15, 40, 50};
        System.out.println(sort(arr));


    }
    
}
