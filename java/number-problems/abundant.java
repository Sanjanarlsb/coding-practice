import java.util.Scanner;
public class abundant {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum > a)
        {
            System.out.println("It is an abundant number");
        }
        else
        {
            System.out.println("It is not an abundant number");
        }
    }
    
}
