public class even_greater_value {
    static int evengreater(int arr[],int value)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0 && arr[i]>value)
            {
                sum=sum+arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int arr[] = {4, 12, 7, 18, 5, 20, 9};
        System.out.println(evengreater(arr,10));
    }
    
}
