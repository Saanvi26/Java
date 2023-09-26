 class Circle{
  double radius;
  Circle(double radius){
    this.radius = radius;
  }
 double Area(double r){
  return Math.PI * r * r;
 }
 void setRadius(double r){
  radius = r;
 }
}

public class CircleTest{
public static void main (String args[]){
  Circle c1 = new Circle(5.0);
  System.out.println("Area of circle is " + c1.Area(5.0));
  c1.setRadius(10.0);
  System.out.println("Area of circle is " + c1.Area(10.0));
}
}
