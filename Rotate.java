import java.util.Scanner;
class Rotate
{
   public static void main(String args[])
{
     int[] arr;
     int size,i,j,d,temp;
     Scanner s=new Scanner(System.in);
     System.out.println("enter size");
     size=s.nextInt();
     arr=new int[size];
     for(i=0;i<size;i++)
{
     arr[i]=s.nextInt();
}
     System.out.println("enter the value of d");
     d=s.nextInt();
     for(i=0;i<d;i++)
{
       temp=arr[0];
     for(j=0;j<size-1;j++)
{
        arr[j]=arr[j+1];
}
     arr[j]=temp;
}
     for(i=0;i<size;i++)
{
     System.out.print(arr[i]);
}
}
}
