import java.util.Scanner;
public class kaprekar {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int square = a*a;
        int count=0;
        int temp=a;
        while(temp > 0)
        {
            count++;
            temp=temp/10;
        }
        int power=1;
        for(int i=1;i<=count;i++)
        {
            power=power*10;
        }
        int left=square/power;
        int right=square%power;
        int sum=left+right;
        if(sum==a)
        {
            System.out.println("It is a kaprekar number");
        }
        else
        {
            System.out.println("It is not a kaprekar number");
        }

    }
    
}
