import java.util.Scanner;
public class spy {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int product = 1;
        int digit;
        int temp = a;
        while(temp > 0)
        {
            digit = temp%10;
            sum=sum+digit;
            product=product*digit;
            temp=temp/10;
        }
        if(sum==product)
        {
            System.out.println("It is a spy number");
        }
        else
        {
            System.out.println("It is not a spy number");
        }
    }
    
}
