package OOPs;
class cylinder
{
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double SurfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
    public double Volume(){
        return Math.PI*radius*radius*height;
    }
}

 class rectangle {
    private int length;
    private int breadth;
    public rectangle() {
        this.length = 4;
        this.breadth = 5;
    }
    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
}
public class ch_9_practice {
    public static void main(String[] args) {
        //1.Create A Class Cylinder And Use getters and setters to set its Radius and Height
       /* cylinder mycylinder=new cylinder();
        mycylinder.setHeight(12);
        int h=mycylinder.getHeight();
        System.out.println(h);
        mycylinder.setRadius(9);
        System.out.println(mycylinder.getRadius());*/

      //2.use 1 To Find volume And Surface Area
       /* cylinder mycylinder=new cylinder();
        mycylinder.setHeight(12);
        int h=mycylinder.getHeight();
        System.out.println(h);
        mycylinder.setRadius(9);
        System.out.println(mycylinder.getRadius());
        System.out.println(mycylinder.SurfaceArea());
        System.out.println(mycylinder.Volume());
  */

        //3. Solve Question 1 Using Constructor Instead of Getter and Setter
     /*   cylinder mycylinder=new cylinder(7,10);
        System.out.println(mycylinder.getRadius());
        System.out.println(mycylinder.getHeight());
        System.out.println(mycylinder.SurfaceArea());
        System.out.println(mycylinder.Volume());
        */

        //4.Overload A Constructor Used To Intialize a rectangle of length 4 and breadth 5for using cusstom parameters
        rectangle r=new rectangle();
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
        rectangle a=new rectangle(10,4);
        System.out.println(a.getBreadth());
        System.out.println(a.getLength());

    }
}
