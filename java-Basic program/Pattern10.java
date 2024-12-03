import java.util.*;
class program8
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no : ");
  int n=s.nextInt();
  for(int i=0;i<=n;i++)
  {
   for(int j=0;j<=i;j++)
   {
    if((i+j)%2==0)
    {
     System.out.println("1");
    }
    else
    {
     System.out.println("0");
    }
   }
   System.out.println();
  }
 }
}