public class negative_counter {
    static int negativecounter(int arr[])
    {
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[] = {10, -4, -7, 20, -2, 8};
        negativecounter(arr);
    }
    
}
