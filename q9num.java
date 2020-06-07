public class q9num
{
    public static void main(char opt,int x)
    {
        double sum=0;
        switch(opt)
        {
            case '1':
            for(int i=1;i<=10;i++)
            {
                int n=2;
                if(i%2==0)
                {
                    int ans=n*i*-1;
                    sum=sum+ans;
                   
                }
                else
                {
                    int ans1=n*i;
                    sum=sum+ans1;
                    
                }
            }
            System.out.println(sum);
            break;
            case '2':
            for(double j=2;j<=20;j+=3)
            {
                   sum= sum + (x/j);
            }
            System.out.println(sum);
            break;
            default:
            System.out.println("Invalid input");
    }
}
}
                
                
            
       