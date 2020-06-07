public class q1floyd
{
    public static void main(int y)
    {
        int i,j,k=1;
        for(i=1;i<=y;i++)
        {
            for(j=1;j<=i;j++,k++)
            {
                System.out.print(k + " " );
            }
            System.out.println();
        }
    }
}