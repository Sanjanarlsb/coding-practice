public class palindrome{
    static boolean palindrome(int arr[])
    {
        boolean palindrome = true;
        for(int i=0;i<arr.length/2;i++)
        {
            if(arr[i]!=arr[arr.length-1-i])
            {
                palindrome=false;
                break;
            }
        }
        return palindrome;
    }
        public static void main(String[] args)
        {
            int arr[] = {1, 2, 3, 2, 1};
            palindrome(arr);
        }
    }

