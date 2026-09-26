public class count_positive {
    static int countpositive(int arr[])
    {
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[] = {-5, 12, -8, 20, 3, -15};
        countpositive(arr);
    }
    
}
