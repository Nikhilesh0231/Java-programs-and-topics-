package OOPs;
class Base{
   public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am in Base and a Constructor");
    }
}
class Derived extends Base{//here base inhr=eritd in Derived
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class ch_10_inheritance {
    public static void main(String[] args) {
        //Creating an Object of base class
        Base b=new Base();
        b.setX(4);
        System.out.println(b.getX());
        //Creating an Object of Derived class
        Derived d=new Derived();
        d.setX(5);
        System.out.println(d.getX());
        d.setY(9);
        System.out.println(d.getY());
    }
}
