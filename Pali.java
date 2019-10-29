class Pali
{
  public static void main(String args[])
{
   char[] rev;
   int k=0;
   char[] str={'m','a','d','a','m'};
   
   int len=str.length;
   rev=new char[len];
    
   for(int i=len-1;i>=0;i--)
{
     rev[k]=str[i];
     k++;
}
  for(int l=0;l<len;l++)
{
   System.out.print(rev[l]);
}
   if(str.equals(rev))
   System.out.println("palindrome");
   else
   System.out.println("not palindrome");
}
}