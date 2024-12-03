import java.util.Scanner;
interface Shape
{
 void area();
}
class Circle implements Shape
{
 final float PI=3.14f;
 float ac,r;
 Scanner s=new Scanner(System.in);
 void accept()
 {
  System.out.println("Enter the radius of circle : ");
  r=s.nextFloat();
 }
 public void area()
 {
  ac=PI*r*r;
 }
 public void show()
 {
  System.out.println("Area of Circle : "+ac);
 }
}
class Sphere implements Shape
{
 final float PI=3.14f;
 float as,r;
 Scanner s=new Scanner(System.in);
 void accept()
 {
  System.out.println("Enter the radius of sphere : ");
  r=s.nextFloat();
 }
 public void area()
 {
  as=4*PI*r*r;
 }
 public void show()
 {
  System.out.println("Area of Sphere : "+as);
 }
}
class program19
{
 public static void main(String args[])
 {
  Circle c1=new Circle();
  Sphere s1=new Sphere();
  c1.accept();
  s1.accept();
  c1.area();
  s1.area();
  c1.show();
  s1.show();
 }
}