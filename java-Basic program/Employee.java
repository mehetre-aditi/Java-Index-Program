import java.util.Scanner;
class program15
{
 public static void main(String args[])
 {
  int n;
  String temp;
  Scanner s=new Scanner(System.in);
  System.out.println("How many names you wnat to enter");
  n=s.nextInt();
  String names[]=new String[n];
  System.out.println("Enetr Employee names");
  for(int i=0;i<n;i++)
  {
   names[i]=s.nextLine();
  }
  for(int i=0;i<n;i++)
  {
   for(int j=i+1;j<n;j++)
   {
    if(names[i].compareTo(names[j])>0)
    {
     temp=names[i];
     names[i]=names[j];
     names[j]=temp;
    }
   }
  }
  System.out.println("Names in sorted order");
  for(int i=0;i<n-1;i++)
  {
   System.out.print(names[i]+" , "); 
  }
  System.out.print(names[n-1]);
 }
} 