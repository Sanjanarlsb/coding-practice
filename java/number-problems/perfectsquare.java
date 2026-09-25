import java.util.Scanner;
public class perfectsquare {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean square=false;
        for(int i=1;i<a;i++)
        {
            if(i*i==a)
            {
                square = true;
            }
        }
        if(square)
        {
            System.out.println("It is a perfect square");
        }
        else
        {
            System.out.println("It is not a perfect sqaure");
        }
    }
    
}
