import java.util.Scanner;
public class Trycatchdemo
{
  public static void main(String args[])
{
   int x,y;
   Scanner s=new Scanner(System.in);
   try
   {
  System.out.println("try block entered");
  System.out.println("enter first integer");
  x=s.nextInt();
  System.out.println("enter second integer");
  y=s.nextInt();
  System.out.println(x/y);
  System.out.println("try block ended");
}
  catch(ArithmeticException e)
{
    System.out.println("denominator cannot be zero");
}
}
}
     