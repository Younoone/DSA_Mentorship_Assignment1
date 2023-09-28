import java.util.*;
public class Pattern
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1;i<=n;i++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
        for(int j= n-2;j>0;j--)
        {
            for (int k = 1; k <= j; k++) {
                System.out.print(" ");
            }
            System.out.print("*" + "\n");

        }
        for(int i = 1;i<=n;i++)
        {
            System.out.print("*");
        }

    }
}
