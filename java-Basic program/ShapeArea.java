class Overdemo
{
 void area(float x,float y)
 {
  System.out.println("Area of Rectangle = "+(x*y));
 }
 void area(double a)
 {
  System.out.println("Area of Circle = "+(3.14*a*a));
 }
 void area(int l,int b)
 {
  System.out.println("Area of Triangle "+(0.5*l*b));
 }
}
class program14
{
 public static void main(String args[])
 {
  Overdemo obj=new Overdemo();
  obj.area(3,5);
  obj.area(5);
  obj.area(5,10);
 }
}


  