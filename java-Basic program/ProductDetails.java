import java.util.Scanner;
class Product
{
 String pname;
 int pid,qty;
 float price,total;
 void accept()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the product name : ");
  pname=s.nextLine();
  System.out.println("Enter the pid,qty and price : ");
  pid=s.nextInt();
  qty=s.nextInt();
  price=s.nextFloat();
 }
 void display()
 {
  total=qty*price;
  System.out.println("pid :"+pid+"\nProduct Name :"+pname+"\nQuantity :"+qty+"\nPrice :"+price+"\nTotal Amount :"+total);
 }
}
class program16
{
 public static void main(String args[])
 {
  int n;
  float to=0;
  Scanner s=new Scanner(System.in);
  System.out.println("How many products you want to enter : ");
  n=s.nextInt();
  Product p1[]=new Product[n];
  for(int i=0;i<n;i++)
  {
   p1[i]=new Product();
   p1[i].accept();
  }
  for(int i=0;i<n;i++)
  {
   p1[i].display();
  }
  for(int i=0;i<n;i++)
  {
   to=p1[i].total;
   System.out.println("Total cost : "+to);
  }
 }
}
  