import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) 
    {
        System.out.println("Enter the no.");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n>0)
        {
            int q = n % 10;
            n = n / 10;
            System.out.print(q);
        }
    }
}
