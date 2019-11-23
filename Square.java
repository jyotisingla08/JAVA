import java.util.*;
class Square
{
  public static void main(String args[])
{
     Scanner s=new Scanner(System.in);
     int num,sq,d=0,div,mod,z,a;
     System.out.println("enter the number");
     num=s.nextInt();
     sq=num*num;
     a=sq;
     while(sq>0)
{
       sq=sq/10;
       d++;
}
     
      d=d/2;
      z=(int)Math.pow(10,d);
      mod=a%z;
      div=a/z;
      if(mod+div==num)
       System.out.println("yes");
      else
       System.out.println("no");
 }
}    