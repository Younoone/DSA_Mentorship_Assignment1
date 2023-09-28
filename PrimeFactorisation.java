import java.util.*;

public class PrimeFactorisation 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter the no.:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 2;i<=n;i++)
        {
            while(n%i == 0 && n>0)
            {
                n = n / i;
                System.out.println(i);
            }
        }
        
    }
