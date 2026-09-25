import java.util.Scanner;
public class strong{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int temp = a;
        int digit;
        while(temp > 0)
        {
            int fact = 1;
           digit = temp % 10;
           for(int i=1;i<=digit;i++)
           {
            fact=fact*i;
           }
           sum = sum+fact;
           temp = temp/10;
        }
        if(sum==a)
        {
            System.out.println("It is a strong number");
        }
        else
        {
            System.out.println("It is not a strong number");
        }

    }
}