import java.util.*;

public class PrintingPrimes 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the value of n");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=2;i<=n;i++)
        {
            int factor = 0;
            for(int j=2;j*j<=i;j++)
            {
                if (i % j == 0) 
                {
                    factor++;
                }

            }
            if(factor<1)
            {
                System.out.println(i);
            }
        }
    }
}
