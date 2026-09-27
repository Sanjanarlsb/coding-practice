public class count_greater_value {
    static int greater(int arr[],int value)
    {
        int count = 0;
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
        int arr[] = {5, 12, 8, 20, 3, 15, 25};
        System.out.println(greater(arr,10));
    }
    
}
