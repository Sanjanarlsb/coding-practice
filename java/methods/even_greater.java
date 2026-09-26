public class even_greater {
    static int evenGreater(int arr[],int value)
    {
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0 && arr[i]>value)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[] = {4, 12, 7, 18, 5, 20, 9};
        System.out.println(evenGreater(arr,10));
    }
    
}
