//wap to print the butterfly pattern
public class six
{
    public static void butterfly_pattern(int n)
    {
        //for ist pattern
        for(int i=1;i<=n;i++)
        {
            //star-i
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            //space-2*(n-i)
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }

            //star-i
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //for 2nd pattern
        for(int i=n;i>=1;i--)
        {
             //star-i
             for(int j=1;j<=i;j++)
             {
                 System.out.print("*");
             }
 
             //space-2*(n-i)
             for(int j=1;j<=2*(n-i);j++)
             {
                 System.out.print(" ");
             }
 
             //star-i
             for(int j=1;j<=i;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
        }
    }
    public static void main(String[]args)
    {
        butterfly_pattern(3);
    }
}