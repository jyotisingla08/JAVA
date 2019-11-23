import java.util.Scanner;
class Jagg
{
  public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    int n,ct=0,i,j,sum=0,avg;
    System.out.println("enter the no of rows");
    n=s.nextInt();
    int[][] a;
    a=new int[n][];
    a[0]=new int[3];
    a[1]=new int[2];
    a[2]=new int[4];
    for(i=0;i<3;i++)
{
     for(j=0;j<a[i].length;j++)
{
     a[i][j]=s.nextInt();
}
}
   for(i=0;i<n;i++)
{
     for(j=0;j<a[i].length;j++)
{
      System.out.print(a[i][j]);
      sum=sum+a[i][j];
      ct++;
}
   System.out.println();
}
   avg=sum/ct;
   System.out.println("no of elements"+ct);
   System.out.println("sum of elements"+sum);
   System.out.println("avg of elements"+avg);
}
}
   
   
  
  