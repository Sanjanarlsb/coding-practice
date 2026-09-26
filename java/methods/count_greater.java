public class count_greater{
    static int countgreater(int arr[],int value)
    {
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>value)
            {
                count++;
            }
        }
        return count;
        
    }
    public static void main(String[] args)
    {
        int arr[] = {5, 12, 8, 20, 3, 15};
        countgreater(arr,10);
    }
}