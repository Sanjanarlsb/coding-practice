import java.util.Scanner;

public class disarium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int digit;
        int sum = 0;
        int reverse = 0;
        int temp = a;
        int temp1 = a;
        int count = 0;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        while (temp1 > 0) {
            digit = temp1 % 10;
            reverse = reverse * 10 + digit;
            temp1 = temp1 / 10;
        }
        int position = 1;

        while (reverse > 0) 
            {
            digit = reverse % 10;

            int power = 1;

            for (int i = 1; i <= position; i++) 
                {
                power = power * digit;
            }

            sum = sum + power;

            position++;
            reverse = reverse / 10;
        }
        if(sum==a)
        {
            System.out.println("It is a disarium number");
        }
        else
        {
            System.out.println("It is not a disarium number");
        }
    }

}
