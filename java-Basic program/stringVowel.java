import java.util.*;
class program2
{
 public static void main(String args[])
 {
  String str;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter any String:");
  str=s.nextLine();
  System.out.println("Vowels in the given String are:");
  for(int i=0;i<str.length();i++)
  {
   if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
   {
    System.out.println(" "+str.charAt(i));
   }
  }
 }
}