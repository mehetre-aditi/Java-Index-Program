import java.io.*;
import java.util.*;
class Cricket
{
 String name;
 int totalruns,notout,inning;
 float avg;
 void accept()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter name of the Player");
  name=s.nextLine();
  System.out.println("Enter Total runs of player");
  totalruns=s.nextInt();
  System.out.println("Enter number of times not out player");
  notout=s.nextInt();
  System.out.println("Enter total innings of player");
  inning=s.nextInt();
 }
 void average()
 {
  avg=totalruns/inning;
  System.out.println("Name :"+name+"\nTotal runs :"+totalruns+"\nInnings :"+inning+"\nAverage :"+avg);
 }
}
public class program17
{
 public static void main(String args[])
 {
  int n;
  float max=0;
  Scanner s=new Scanner(System.in);
  System.out.println("How many players :");
  n=s.nextInt();
  Cricket c1[]=new Cricket[n];
  for(int i=0;i<n;i++)
  {
   c1[i]=new Cricket();
   c1[i].accept();
  }
  for(int i=0;i<n;i++)
  {
   c1[i].average();
  }
  for(int i=0;i<n;i++)
  {
   if(max<c1[i].avg)
   {
    max=c1[i].avg;
   }
  }
  System.out.println("---------------------------------\nMaximum Average :"+max);
 }
}