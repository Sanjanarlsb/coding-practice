public class missing_element {
    static int missing(int arr[])
    {
       int n = arr.length+1;
       int sum1=n*(n+1)/2;
       int sum=0;
       for(int i=0;i<arr.length;i++)
       {
        sum=sum+arr[i];
       }
       return sum1-sum;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,5};
        System.out.println(missing(arr));
    }
    
}
