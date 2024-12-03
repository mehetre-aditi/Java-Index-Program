import java.util.Scanner;
class program13
{
 public static void main(String args[])
 {
  int a[]=new int[10];
  int n,sum=0;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the size of an array:");
  n=s.nextInt();
  System.out.println("Enter the elements of an array:");
  for(int i=0;i<=n;i++)
  {
   a[i]=s.nextInt();
  }
  for(int i=0;i<=n;i++)
  {
   if(a[i]%2==0)
   {
    sum=sum+a[i];
   }
  }
  System.out.println("Sum of even numbers of array : "+sum);
 }
}