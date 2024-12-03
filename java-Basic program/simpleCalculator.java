import java.util.*;
class program5
{
 public static void main(String args[])
 {
  int a,b,ch;
  Scanner s=new Scanner(System.in);
  System.out.println("enter your choice:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
  ch=s.nextInt();
  System.out.println("Enter two numbers:");
  a=s.nextInt();
  b=s.nextInt();
  switch(ch)
  {
   case 1:System.out.println("Addition="+(a+b));
   break;
   case 2:System.out.println("Subtraction="+(a-b));
   break;
   case 3:System.out.println("Multiplication="+(a*b));
   break;
   case 4:System.out.println("Division="+(a/b));
   break;
   default:System.out.println("Enter the correct choice");
  }
 }
}

  