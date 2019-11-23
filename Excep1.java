class Excep1
{
  public static void main(String args[])
{
  String str=null;
  try
{
   System.out.println("statement 1");
   //System.out.println(10/0);
   if(str.equals("gfg"))
     System.out.println("same");
   else
     System.out.println("not same");
  
}
  catch(ArithmeticException e)
{
   System.out.println("not possible");
}
  catch(Exception e)
{
  System.out.println("any other exception");
}
}
}