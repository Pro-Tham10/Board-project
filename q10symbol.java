public class q10symbol
{
   public static void main(int line)
   {
     for(int i=1;i<=line;i++)
   {
    System.out.print(i+" ");
    for(int a=1;a<=i;a++)
{
    if(a%2==0)
    {
        System.out.print("#"+" ");
    }
    else
    {
        System.out.print("*"+" ");
    }
}
System.out.println();
}
}
}