public class occurences {
    static int occur(int arr[],int value)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==value)
            {
              count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[] = {10, 20, 10, 30, 10, 40, 20};
        System.out.println(occur(arr,10));
    }
    
}
