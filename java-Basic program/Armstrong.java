import java.util.*;
class program3
{
 public static void main(String args[])
 {
  int n,r,t,sum=0;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter any number:");
  n=s.nextInt();
  t=n;
  while(n>0)
  {
   r=n%10;
   sum=sum+r*r*r;
   n=n/10;
  }
  if(sum==t)
  {
   System.out.println(t+" Number is Armstrong");
  }
  else
  {
   System.out.println(t+" Number is not Armstrong");
  }
 }
}