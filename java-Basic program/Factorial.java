import java.util.*;
class program6
{
 public static void main(String args[])
 {
  int n,fact=1;
  Scanner s=new Scanner(System.in);
  System.out.println("Ener any number :");
  n=s.nextInt();
  for(int i=1;i<=n;i++)
  {
   fact=fact*i;
  }
  System.out.println("Factorial = "+fact);
 }
}