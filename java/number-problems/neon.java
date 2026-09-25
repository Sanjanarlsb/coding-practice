import java.util.Scanner;
public class neon {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int digit;
        int sum = 0;
        int temp = a*a;
        while(temp > 0)
        {
            digit = temp%10;
            sum=sum+digit;
            temp = temp / 10;
        }
        if(sum==a)
        {
            System.out.println("It is an neon number");
        }
        else
        {
            System.out.println("It is not a neon number");
        }
    }
    
}
