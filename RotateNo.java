import java.util.*;

public class RotateNo 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the no.");

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Enter by which no. has to be rotated:");
        int m = n;
        int count = 0;
        while(n>0)
        {
            n = n / 10;
            count++;
        }
        
        int r = scn.nextInt();
        r = r % count;
        if(r<0)
        {
            r = count + r;
        }
        int d = (int)Math.pow(10,r);
        int q = m/d;
        int rem = m%d;
        int rot = rem * (int) Math.pow(10, count - r) + q;

        System.out.println(rot);

    }
}
