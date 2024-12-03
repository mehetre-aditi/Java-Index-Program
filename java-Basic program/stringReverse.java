class program10
{
 public static String reverseStr(String str)
 {
  char ch[]=str.toCharArray();
  int length=ch.length;
  char rev1[]=new char[length];
  for(int i=0;i<length;i++)
  {
   rev1[i]=ch[length-i-1];
  }
  return new String(rev1);
 }
 public static void main(String args[])
 {
  String str="Hello World";
  System.out.println("Original string is: "+str);
  String rev=reverseStr(str);
  System.out.println("Reverse string is: "+rev);
 }
}