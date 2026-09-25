import java.util.Scanner;
public class deficient {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum < a)
        {
            System.out.println("It is a deficient number");
        }
        else
        {
            System.out.println("It is not a deficient number");
        }
    }
    
}
 
