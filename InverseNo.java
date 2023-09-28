import java.util.*;

public class InverseNo 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int inverse = 0;
        int count = 0;
        int m = n;
        while(n>0)
        {
            n = n / 10;
            count++;

        }
        System.out.println(count);

        
        for (int i = 1; i <= count;i++)
        {
            int p = m % 10;
            m = m / 10;
            int e = (int) (Math.pow(10, p - 1));
            inverse = inverse + i * e;
        }
        System.out.println(inverse);
    }
}
