package NikhileshProgrmas;
abstract class Shape{
    abstract double area();
    void display(){
        System.out.println("This Is A Shape.");
    }
}
class Circle extends Shape{
    private double radius ;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    double area(){
        return Math.PI*radius *radius;
    }
}
class Rectangle extends Shape{
    private double length;
    private double breadth;
    Rectangle(double length ,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}
public class program4 {
    public static void main ( String args[]){
        Circle C1 = new Circle(2);
        C1.display();
        System.out.println("Area of The Circle: " + C1.area());
        Rectangle R1 = new Rectangle(5,10);
        R1.display();
        System.out.println("Area Of Rectangle " + R1.area());
    }
}
