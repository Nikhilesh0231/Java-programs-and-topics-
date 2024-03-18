package OOPs;
class Employee1
{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name=n;
    }
}
class Cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("vibrating...");
    }
    public void callfriend(){
        System.out.println("calling Ripunjai..");
    }
}
    class Square {
           int side;
            public int perimetre() {
             return 4*side;
                 }
              public int area() {
              return  side*side;
               }
                  }
     class Rectangle{
         int length;
         int breadth;
         public int area(){
             return  length*breadth;
         }
         public int perimetre(){
             return 2*length+2*breadth;
         }
     }
     class Tommy{
    public void hit(){
        System.out.println("Hitting The Enemy");
    }
         public void run(){
             System.out.println("Running The Enemy");
         }
         public void fire(){
             System.out.println("Firing The Enemy");
         }
     }
     class Circle
     {
         float radius;
         public float area(){
                 return  22*radius*radius/7;
         }
         public float circumference(){
             return  2*22*radius/7;
         }
     }
public class ch_8_practice {

    public static void main(String[] args) {
//problem1
      /*  Employee1 nikhilesh=new Employee1();
        nikhilesh.setName("veeru");
        System.out.println(nikhilesh.getName());
        nikhilesh.salary=125000;
        System.out.println(nikhilesh.getSalary());*/
//problem 2
       /* Cellphone Galaxya23= new Cellphone();// object creation
        Galaxya23.callfriend();
        Galaxya23.ringing();
        Galaxya23.vibrating();*/
// problem 3
      /*  Square s1=new Square();
        s1.side=10;
        System.out.println(s1.area());
        System.out.println(s1.perimetre());*/
        // problem4
        /*Rectangle r1=new Rectangle();
        r1.length=10;
        r1.breadth=20;
        System.out.println(r1.area());
        System.out.println(r1.perimetre());*/
        //problem 5
       /* Tommy first=new Tommy();
        first.hit();
        first.fire();
        first.run();*/
        //problem 6
        Circle c1=new Circle();
        c1.radius=10.0f;
        System.out.println(c1.area());
        System.out.println(c1.circumference());
    }
}
