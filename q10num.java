public class q10num
{
    public static void main(int line)
    {
        for(int i=1;i<=line;i++)
        {
            for(int p=line;p>=i;p--)
            {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}