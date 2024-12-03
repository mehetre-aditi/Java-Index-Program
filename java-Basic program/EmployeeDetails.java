import java.util.*;
class Employee
{
 String ename,dname;
 int id,salary;
 void accept()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the Employee name : ");
  ename=s.nextLine();
  System.out.println("Enter the Department name : ");
  dname=s.nextLine();
  System.out.println("Enter employee id & salary : ");
  id=s.nextInt();
  salary=s.nextInt();
 }
}
class Manager extends Employee
{
 int bonus;
 void details()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter manager bonus : ");
  bonus=s.nextInt();
 }
 void display()
 {
  int totalsal;
  totalsal=salary+bonus;
  System.out.println("ID : "+id+"\nEmployee Name : "+ename+"\nDepartment name : "+dname+"\nSalary : "+salary);
  System.out.println("Total salary : "+totalsal);
 }
}
class program21
{
 public static void main(String args[])
 {
  int n;
  Scanner s=new Scanner(System.in);
  System.out.println("How many records you want to enter : ");
  n=s.nextInt();
  Manager m1[]=new Manager[n];
  for(int i=0;i<n;i++)
  {
   m1[i]=new Manager();
   m1[i].accept();
   m1[i].details();
  }
  for(int i=0;i<n;i++)
  {
   m1[i].display();
  }
 }
}


 