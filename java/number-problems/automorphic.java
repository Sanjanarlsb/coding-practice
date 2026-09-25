import java.util.Scanner;
public class automorphic {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int square = a*a;
        int digit;
        int count=0;
        int temp = a;
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
            digit = square%power;
            if(digit==a)
            {
                System.out.println("It is a automorphic number");
            }
            else
            {
                System.out.println("It is not a automorphic number");
            }
        }
        
    }

