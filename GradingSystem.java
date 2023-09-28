import java.util.*;

public class GradingSyatem 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter your marks:");
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        if(m>90)
        {
            System.out.println("Your grade is A+");
        }
        else if(m>80 && m<=90)
        {
            System.out.println("You rgrade is A");
        }
        else if(m>70 && m<=80)
        {
            System.out.println("Your grade is B+");
        }
        else if(m>60 && m<=70)
        {
            System.out.println("Your grade is B");
        }
        else if(m>50 && m<=60)
        {
            System.out.println("Your grade is C+");
        }
        else if(m>40 && m<=50)
        {
            System.out.println("Your grade is C");
        }
        else if(m>33 && m<=40)
        {
            System.out.println("Your grade is D");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}
