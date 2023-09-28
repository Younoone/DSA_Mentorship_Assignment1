import java.util.*;

public class Prime 
{
    public static void main(String[]args)
    {
        System.out.println("Enter the no.");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int factor = 0;
        for(int i=2;i*i<=n;i++)
        {
            if (n % i == 0) {
                factor++;
            }
        }
        if(factor<1)
        {
            System.out.println("The no. is prime");
        }
        else
        {
            System.out.println("The no. is not prime");
        }
    }
}
