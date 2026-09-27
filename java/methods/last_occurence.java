public class last_occurence {
    static int lastoccur(int arr[],int value)
    {
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==value)
            {
                return i;
            }
        }
        return -1;
    }
        public static void main(String[] args)
        {
            int arr[] = {10, 20, 30, 20, 40, 20, 50};
            System.out.println(lastoccur(arr,20));
        }
    }
    

