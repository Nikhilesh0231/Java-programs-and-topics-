package OOPs;
class Circle1{
    public int radius;
    Circle1(){
        System.out.println("I Am Not Parameterized Constructor Of Circle");
    }
    Circle1(int r){
        System.out.println("I Am Circle Parameterized Constructor Of Circle");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int r,int h){
        super(r);// if we comment out this super keyword then by default constructor with no parameter inherits
        System.out.println("I Am Cylinder Parameterized Constructor");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class ch_10_practice {
    public static void main(String[] args) {
        // problem 1.Create a Class Circle And Use Inheritance To Create Another Class Cylinder From It.
        Cylinder1 obj=new Cylinder1(12,4);
       Circle1 objC=new Circle1(12);

       // Do Remaining Problems
    }
}
