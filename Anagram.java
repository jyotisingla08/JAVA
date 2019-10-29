import java.util.*;
class Anagram
{
  public static void main(String args[])
{
   Scanner s=new Scanner(System.in);
   String str1,str2;
   int flag=0,p,i;
   str1=s.next();
   str2=s.next();
   str1=str1.toLowerCase();
   str2=str2.toLowerCase();
   int[] arr1=new int[26];
   int[] arr2=new int[26];
   int n1=str1.length();
   int n2=str2.length();
   for(i=0;i<n1;i++)
{
     int j=(int)str1.charAt(i);
     j=j-97;
     arr1[j]++;
}
   for(p=0;p<n2;p++)
{
   int m=(int)str2.charAt(p);
   m=m-97;
   arr2[m]++;
}
   for(i=0;i<n1;i++)
{
   if(arr1[i]!=arr2[i])
   {
     flag=0;
     break;
   }
else
  flag=1;
}
if(flag==1)
System.out.println("anagram");
else
System.out.println("not a anagram");
}
}
