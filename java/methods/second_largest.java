public class second_largest {
    static int secondlargest(int arr[])
    {
        int largest = arr[0];
        int secondLargest = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i] > secondLargest)
            {
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String [] args)
    {
        int arr[] = {10, 25, 7, 40, 18, 32};
        System.out.println(secondlargest(arr));
    }
    
}
