public class q4bank
{
    public static void main(double principal,double rate,int timemonths ,int timeyears,char opt)
    {
        double amt;
        switch(opt)
        {
           case'1':
            amt=principal*Math.pow((1+rate/100),timeyears);
            System.out.println(amt);
            break;
           case'2':
            amt=principal*timemonths + principal*timemonths*rate*(timemonths+1)/2400;
           System.out.println(amt);
           break;
           default:
           System.out.println("only 2 options available");
           break;
        }
    }
}