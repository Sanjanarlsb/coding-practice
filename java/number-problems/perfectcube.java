import java.util.Scanner;
public class perfectcube {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean cube=false;
        for(int i=1;i<a;i++)
        {
            if(i*i*i==a)
            {
                cube = true;
            }
        }
        if(cube)
        {
            System.out.println("It is a perfect cube");
        }
        else
        {
            System.out.println("It is not a perfect cube");
        }
    }
    
}

