public class q5tri
{
    public static void main(int opt,int line)
   
   {
       switch(opt)
       {
           case 1:
       char ch='a';
       int in=ch+line-1;
       char chnew=(char)in;
       for(int i=1;i<=line;i++)
       {
           for(ch='a';ch<=chnew;ch++)
           {
               System.out.print(ch + " ");
            }
            System.out.println();
            chnew--;
        }
        break;
        case 2:
       for(int a=1;a<=line;a++)
       {
           for(int b=1;b<=a;b++)
           {
               System.out.print(b +" ");
            }
            System.out.println();
        }
        break;
        default:
        System.out.println("only 2 options available");
    }
    }
}
        
   