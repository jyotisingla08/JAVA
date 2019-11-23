import java.lang.String;
class String1
{
   public static void main(String args[])
{
     String s1="jyoti singla";
     System.out.println(s1);
     String s2=new String("hello world");
     System.out.println(s2);
     s2=s2.concat("classes");
     System.out.println(s2);
     System.out.println(s1.toUpperCase());
     System.out.println(s2.startsWith("J"));
     System.out.println(s1.replace('i','a'));
     System.out.println(s1.substring(2));
      System.out.println(s1.length());
      System.out.println(s1.charAt(2));
     System.out.println(s1.substring(2,5));
     
}
}