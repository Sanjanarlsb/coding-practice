import java.util.Scanner;
public class duck {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int digit;
        boolean isduck=false;
        int temp=a;
        while(temp > 0)
        {
            digit=temp%10;
            if(digit==0)
            {
               isduck=true;
            }
            temp=temp/10;
        }
        if(isduck)
        {
            System.out.println("It is a duck number");
        }
        else
        {
            System.out.println("It is not a duck number");
        }
    }
    
}
