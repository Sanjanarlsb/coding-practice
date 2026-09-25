import java.util.Scanner;
public class harshad {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int digit;
        int sum=0;
        int temp=a;
        while(temp > 0)
        {
            digit = temp % 10;
            sum = sum+digit;
            temp = temp/10;
        }
        if(a%sum==0)
        {
            System.out.println("It is a harshad number");
        }
        else
        {
            System.out.println("It is not a harshad number");
        }
    }
    
}
