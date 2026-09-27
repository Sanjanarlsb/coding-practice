//Adds number which are greater than the value specified 
public class sumgreater {
    static int sum(int arr[],int value)
    {
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>value)
            {
                sum=sum+arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int arr[] = {5, 12, 8, 20, 3, 15};
        System.out.println(sum(arr,10));
    }
}
