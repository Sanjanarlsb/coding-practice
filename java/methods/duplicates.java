public class duplicates {
    static int duplicates(int arr[])
    {
        int repeated_element=-1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]==arr[i])
                {
                    repeated_element=arr[j];
                }
            }
        }
        return repeated_element;
        
    }
    public static void main(String[] args)
    {
      int arr[] = {2, 5, 3, 2, 7};
       System.out.println(duplicates(arr));
    }
}
