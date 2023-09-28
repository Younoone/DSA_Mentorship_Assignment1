import java.util.*;

public class Gcd_Lcm {
    public static void main(String[] args) 
    {
        System.out.println("Enter the numbers");
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int GCD = 1;
        if(m>n)
        {
            for (int i = 1; i <= n; i++) {
                if (m % i == 0 && n % i == 0) {
                    GCD = i;
                }
            }
            System.out.println("GCD is :"+GCD);
        }
        if(n>m)
        {
            for (int i = 1; i <= n; i++) {
                if (m % i == 0 && n % i == 0) {
                    GCD = i;
                }
            }
            System.out.println("GCD is :"+GCD);
        }


        int LCM = 1;
        if(m>n)
        {
            for (int i = 1; i <= n; i++) {
                if ((m * i) % n == 0) {
                    LCM = m * i;
                    break;
                }
            }
            System.out.println("LCM is :"+LCM);
        }
        if(n>m)
        {
            for (int i = 1; i <= m; i++) {
                if ((n * i) % m == 0) {
                    LCM = n * i;
                    break;
                }
            }
            System.out.println("LCM is :"+LCM);
        }
        
    }
}
